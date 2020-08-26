package com.example.oekaki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //画面推移
    fun toDrawingPage(view: View?){
        val intent = Intent(this, Drawing_page::class.java)
        startActivity(intent)
    }
}
