package com.ismail.belajarview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleview.layoutManager = LinearLayoutManager(this)
        recycleview.adapter = MainAdapter()


        btnQrCode.setOnClickListener() {

            val intent = Intent(this, ListMenuActivity::class.java)
            startActivity(intent)
        }
    }
}
