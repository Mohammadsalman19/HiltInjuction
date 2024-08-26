package com.example.hiltinjuction

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.location.Location
import android.os.Bundle
import android.provider.CallLog.Locations
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

   lateinit var location: Location
   lateinit var bitmap: Bitmap
   lateinit var context: Context
   lateinit var sharedPreferences:SharedPreferences
   lateinit var hello: String
   var why: String ="Hello"

    fun inverse(a:String,b:Float): Boolean{
        return false
    }


    @Inject
    lateinit var toUserThisInMainActivity: ToUserThisInMainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        hello= "Hello"
        val a = inverse("ok",1.0f)
        println(a)
        println(inverse("s",1.0f))

        toUserThisInMainActivity.useMe()
        Log.d("****",toUserThisInMainActivity.useMe())
    }

}