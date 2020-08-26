package com.example.oekaki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_drawing_page.*

class Drawing_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawing_page)
        /// CustomSurfaceViewのインスタンスを生成しonTouchリスナーをセット
        val customSurfaceView = CustomSurfaceView(this, surfaceView)
        surfaceView.setOnTouchListener { v, event ->
            customSurfaceView.onTouch(event)
        }
    }
    // 戻るボタン
    fun toStartPage(view: View?){
        finish()
    }

}