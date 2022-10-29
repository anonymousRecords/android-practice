package com.chapdo.practice.practice.viewbinding.practice.activitymove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chapdo.practice.practice.viewbinding.practice.activitymove.databinding.ActivityMainBinding
import com.chapdo.practice.practice.viewbinding.practice.activitymove.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}