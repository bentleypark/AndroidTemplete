package com.bentley.common.ex

import android.app.Activity
import android.content.pm.PackageManager
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.viewbinding.ViewBinding

inline fun <T : ViewBinding> AppCompatActivity.viewBinding(
    crossinline bindingInflater: (LayoutInflater) -> T
) =
    lazy(LazyThreadSafetyMode.NONE) {
        bindingInflater.invoke(layoutInflater)
    }

// permission 체크
fun Activity.isHasPermission(vararg permissions: String): Boolean {
    return permissions.all { singlePermission ->
        applicationContext.checkSelfPermission(singlePermission) == PackageManager.PERMISSION_GRANTED
    }
}

// permission 요청
fun Activity.askPermission(vararg permissions: String, requestCode: Int) =
    ActivityCompat.requestPermissions(this, permissions, requestCode)