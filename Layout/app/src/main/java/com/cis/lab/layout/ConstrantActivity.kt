package com.cis.lab.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constrant.*

class ConstrantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrant)


        button3.setOnClickListener {
            this.finish() //จบการทำงานเคลียร์ทุกหน้าออก
        }
    }
}
