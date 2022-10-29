package com.chapdo.practice.practice.viewbinding.changevalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chapdo.practice.practice.viewbinding.changevalue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.mainTv.text = "viewBinding으로 activity_main.xml TV 내용 바꾸기"
    }
}