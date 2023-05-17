package com.plcoding.sharingdataprep.content.util

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PersistentViewModel2 @Inject constructor(
    private val sessionCache: SessionCache
): ViewModel() {

    val session get() = sessionCache.getActiveSession()
}