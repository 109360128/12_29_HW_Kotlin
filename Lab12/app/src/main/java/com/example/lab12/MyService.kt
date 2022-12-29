package com.example.lab12
import android.app.Service
import android.content.Intent
import android.os.IBinder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
class MyService : Service() {
    override fun onCreate() {
        super.onCreate()
        GlobalScope.launch {
            delay(3000)
            try {
                val intent = Intent(this@MyService, SecActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }
            catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }

    override fun onStartCommand(intent: Intent,
                                flags: Int, startid: Int): Int {
        return START_NOT_STICKY}
    override fun onBind(intent: Intent): IBinder? = null
}