package com.ftiuksw.peminjamanlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun go2secondActivity(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        intent.putExtra("name",FirstName_ID.text.toString())
        startActivity(intent)
    }

}