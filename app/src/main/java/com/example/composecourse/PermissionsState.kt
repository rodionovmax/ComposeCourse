@file:OptIn(ExperimentalPermissionsApi::class)

package com.example.composecourse

import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.shouldShowRationale

fun PermissionState.isPermanentlyDenied(): Boolean {
    return !status.shouldShowRationale && !status.isGranted
}