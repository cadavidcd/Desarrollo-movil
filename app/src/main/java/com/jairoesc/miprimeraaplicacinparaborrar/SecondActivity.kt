package com.jairoesc.miprimeraaplicacinparaborrar

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val data = intent.getStringExtra("data")

        Log.v("Level",data)
    }

    fun closeIntent(v: View){
        finish()
    }
}
