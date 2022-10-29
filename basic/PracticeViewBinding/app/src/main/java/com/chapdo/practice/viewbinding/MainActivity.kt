package com.chapdo.practice.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chapdo.practice.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    // activity 내에서만 사용하기 때문에 private
    // lateinit var 나중에 선언해주겠다는 의미
    // viewBinding 변수이기 때문에 원하는 변수명으로
    // activity_main.xml -> ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        // inflate는 xml 파일 읽어서 해석하겠다는 의미
        setContentView(viewBinding.root)
        // root가 activity_layout.xml에서 상단에 있는 constraintlayout을 가리킴.
    }
}