package com.ismail.belajarview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activty_menu_resto.*

class ListMenuActivity : AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_menu_resto)

        rc_menu_resto.layoutManager = LinearLayoutManager(this)
        rc_menu_resto.adapter = ListMenuAdapter(this)
    }
}
