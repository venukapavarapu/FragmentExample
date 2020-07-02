package com.venu.fragmentexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel(){

    val data = MutableLiveData<String>()

    fun setData(value : String){
        data.postValue(value)
    }
}