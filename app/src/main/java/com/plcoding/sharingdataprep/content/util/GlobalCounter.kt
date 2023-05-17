package com.plcoding.sharingdataprep.content.util

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GlobalCounter @Inject constructor() {

    private val _count = MutableStateFlow(0)
    val count = _count.asStateFlow()

    fun inc() {
        _count.value++
    }
}