package com.ftiuksw.peminjamanlab

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class HomeActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var message = intent.getStringExtra("name")
        HelloMessage_ID.text = message

        val id = "updated"

        val name = getString(R.string.abc_action_bar_home_description)

        val description = getString(R.string.abc_action_bar_home_description)
        val importance = NotificationManager.IMPORTANCE_HIGH
        val mChannel = NotificationChannel(id, name, importance)

        mChannel.description = description
        mChannel.enableLights(true)

        mChannel.lightColor = Color.RED
        mChannel.enableVibration(true)

        val CHANNEL_ID = "updated"

        // Use NotificationCompat.Builder to add the notification objects
        val mBuilder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.notification_icon_background)
            .setContentTitle("Status Login")
            .setContentText("Login Sukses!")

        val mNotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        mNotificationManager.createNotificationChannel(mChannel)
        mNotificationManager.notify(1, mBuilder.build())
    }

    fun go2orderactivity(view: View) {
        var intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }

    fun go2loginactivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}