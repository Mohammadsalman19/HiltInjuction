package com.example.hiltinjuction

import android.telecom.Call
import javax.inject.Inject

class ToUserThisInMainActivity @Inject constructor() {
    //no parameter
    fun ok(): Int{
        return 0
    }
    //no para no return
    fun noname(){
    }
    //1 para no R
    fun name(a:Int){
    }
    //3 para 1 return
    fun three(a:Int,b:Boolean,c:Float): Boolean {
        return true
    }

    fun main(){
        ok()
        noname()
        name(1)
        three(1,true,1.2f)

        println(ok())
        println(three(1,true,1.2f))
        var a: Add = Add(2,3)
        a.execute()
    }

}

class Calculation {
}
class Add(var a:Int,var b:Int){
    fun execute(): Int {
        return a + b
    }
}
