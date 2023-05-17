package com.plcoding.sharingdataprep.content.util

interface SessionCache {

    fun saveSession(session: Session)

    fun getActiveSession(): Session?

    fun clearSession()
}