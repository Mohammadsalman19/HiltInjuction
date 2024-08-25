package com.example.hiltinjuction

import javax.inject.Inject

class ToUserThisInMainActivity @Inject constructor() {
    fun useMe(): String{
        return "Successful Used"
    }
}