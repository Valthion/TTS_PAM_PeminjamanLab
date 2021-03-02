package com.ftiuksw.peminjamanlab

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_third.*

class OrderActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }
    fun about(view :View){
        val SaveAlert= AlertDialog.Builder(this)
        SaveAlert.setTitle("Order Status")
        SaveAlert.setMessage("Ruangan telah penuh!")
        SaveAlert.setPositiveButton("Oke") { dialogInterface: DialogInterface?, which: Int ->
            Toast.makeText(
                applicationContext, "Mohon Pilih Ruangan yang Kosong",
                Toast.LENGTH_LONG
            ).show()
        }

        SaveAlert.show()
    }
    fun go2suksesactivity (view: View) {
        var intent = Intent(this, SuccessActivity::class.java)
        startActivity(intent)
    }
}