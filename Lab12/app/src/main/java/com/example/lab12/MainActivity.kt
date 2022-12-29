package com.example.lab12
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_start).setOnClickListener {
            startService(Intent(this, MyService::class.java))
            Toast.makeText(this, "啟動 Service", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}