package com.edo.mylibrary

import com.unity3d.player.UnityPlayer

class LibrarySample(private var age: Int = 5) {
    fun getValue(): Int {
        return age
    }
    
    fun setValue(newValue: Int) {
        age = newValue
    }
    
    fun unityCall() {
        UnityPlayer.UnitySendMessage("UnityObject", "FromKotlin", "args $age")
    }
}