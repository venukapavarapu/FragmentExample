package com.venu.fragmentexample.utils

import android.content.SharedPreferences
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

inline fun FragmentManager.inTrasaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}

inline fun SharedPreferences.edit(a : SharedPreferences.Editor. () -> Unit){
    val editore= edit()
    editore.a()
    editore.apply()
}