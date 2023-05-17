package com.plcoding.sharingdataprep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.plcoding.sharingdataprep.content.*
import com.plcoding.sharingdataprep.ui.theme.SharingDataPrepTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SharingDataPrepTheme {
                PersistentStorageSample()
            }
        }
    }
}

