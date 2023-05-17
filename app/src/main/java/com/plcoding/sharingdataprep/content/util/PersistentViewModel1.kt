package com.plcoding.sharingdataprep.content.util

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PersistentViewModel1 @Inject constructor(
    private val sessionCache: SessionCache
): ViewModel() {

    val session get() = sessionCache.getActiveSession()

    fun saveSession() {
        sessionCache.saveSession(
            session = Session(
                user = User(
                    firstName = "Philipp",
                    lastName = "Lackner",
                    email = "test@test.com"
                ),
                token = "sample-token",
                expiresAt = 12345678910
            )
        )
    }
}