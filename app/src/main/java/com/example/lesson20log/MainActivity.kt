package com.example.lesson20log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myObserver: MyObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastMeState("onCreate")

       lifecycle.addObserver(myObserver)
    }

    override fun onStart() {
        super.onStart()
        toastMeState( "onStart")
    }

    override fun onResume() {
        super.onResume()
        toastMeState("onResume")
    }

    override fun onPostResume() {
        super.onPostResume()
        toastMeState("onPostResume")
    }

    override fun onPause() {
        super.onPause()
        toastMeState("onPause")
    }

    override fun onStop() {
        super.onStop()
        toastMeState("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        toastMeState("onDestroy")
    }

    fun onClickNewActivity(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    private fun toastMeState(message: String){
        Toast.makeText(this, "${lifecycle.currentState}, $message", Toast.LENGTH_LONG).show()
    }
}