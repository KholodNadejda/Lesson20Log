package com.example.lesson20log

import android.util.Log
import android.view.accessibility.AccessibilityEvent
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import javax.xml.transform.Source

class MyObserver: LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun myFun(source: LifecycleOwner, event: Lifecycle.Event){
        Log.d("MyLog", event.toString())
    }
}