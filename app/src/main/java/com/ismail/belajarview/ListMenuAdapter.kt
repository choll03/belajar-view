package com.ismail.belajarview

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView

class ListMenuAdapter (val context: Context): RecyclerView.Adapter<LisMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LisMenuViewHolder {

        val layoutInflater = LayoutInflater.from(context).inflate(R.layout.list_menu, parent, false)
        return LisMenuViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: LisMenuViewHolder, position: Int) {
        holder.bindItem(context)
    }

}

class LisMenuViewHolder(view: View) : RecyclerView.ViewHolder(view){
    fun bindItem(context: Context) {
        itemView.setOnClickListener {

            val alertDialog  = AlertDialog.Builder(context).create()
            val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_add_to_cart, null)

            alertDialog.setView(dialogView)
            alertDialog.setTitle("Jumlah Pesan")

            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Simpan") { dialog, which ->
                dialog.dismiss()
            }

            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Batal") { dialog, which ->
                dialog.dismiss()
            }

            alertDialog.show()

            val btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
            val btnNegative = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)

            val layoutParams = btnPositive.layoutParams as LinearLayout.LayoutParams
            layoutParams.weight = 10f
            btnPositive.layoutParams = layoutParams
            btnNegative.layoutParams = layoutParams

        }
    }

}
