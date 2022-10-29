package com.chapdo.practice.practice.viewbinding.practice.activitymove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chapdo.practice.practice.viewbinding.practice.activitymove.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.bntNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", "intent로 값 넘기기")
            startActivity(intent)
        }
    }
}