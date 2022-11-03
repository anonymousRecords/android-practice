package com.chapdo.baemin

import RecyclerItemAdapter
import VPMainADAdapter
import VPMyTownADAdapter
import VPTodayAdapter
import android.app.Activity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.chapdo.baemin.Adapter.RVkeyAdapter
import com.chapdo.baemin.databinding.ActivityMainBinding
import com.chapdo.baemin.item.KeyData
import com.chapdo.baemin.item.UserData

class MainActivity : Activity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)
        // RV 키워드
        val key_list = ArrayList<KeyData>()
        key_list.add(KeyData("버거🍔"))
        key_list.add(KeyData("도넛🍩"))
        key_list.add(KeyData("샐러드🥗"))
        key_list.add(KeyData("케이크🍰"))
        key_list.add(KeyData("도시락🍱"))
        key_list.add(KeyData("초밥🍣"))
        key_list.add(KeyData("피자🍕"))
        key_list.add(KeyData("타코🌮"))
        key_list.add(KeyData("치킨🍗"))

        val adapter_key = RVkeyAdapter(key_list)
        viewBinding.RVKey.adapter = adapter_key

        // RV 우리 동네 빠른 배달
        val my_town_list = ArrayList<UserData>()
        my_town_list.add(UserData(ContextCompat.getDrawable(this, R.drawable.my_town_1)!!, "코탈리안 파스타", "⭐️4.9", "0원~2900원", "15분~25분"))
        my_town_list.add(UserData(ContextCompat.getDrawable(this, R.drawable.my_town_2)!!, "모모돈까스모밀", "⭐️4.9", "0원~1900원", "11분~21분"))
        my_town_list.add(UserData(ContextCompat.getDrawable(this, R.drawable.my_town_3)!!, "야미마라탕", "⭐️4.7", "0원~2900원", "13분~23분"))
        my_town_list.add(UserData(ContextCompat.getDrawable(this, R.drawable.my_town_4)!!, "한나감자탕", "⭐️3.4", "0원~4900원", "10분~20분"))
        my_town_list.add(UserData(ContextCompat.getDrawable(this, R.drawable.my_town_5)!!, "배민 된장찌개", "⭐️2.2", "0원~1000원", "20분~35분"))

        val adapter = RecyclerItemAdapter(my_town_list)
        viewBinding.lstUser.adapter = adapter

        // VP AD 메인
        var viewPager_main = findViewById<ViewPager2>(R.id.AD_main)
        viewPager_main.adapter = VPMainADAdapter(getMainAdList()) // 어댑터 생성
        viewPager_main.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로

        // VP AD my town
        var viewPager_my_town = findViewById<ViewPager2>(R.id.AD_my_town)
        viewPager_my_town.adapter = VPMyTownADAdapter(getMyTownAdList()) // 어댑터 생성
        viewPager_my_town.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로

        // VP today discount
        var viewPager_today_discount = findViewById<ViewPager2>(R.id.VP_today_discount)
        viewPager_today_discount.adapter = VPTodayAdapter(getTodayDiscount()) // 어댑터 생성
        viewPager_today_discount.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로
    }
    // VP AD 메인
    private fun getMainAdList(): ArrayList<Int> {
        return arrayListOf<Int>(R.drawable.ad_main_1, R.drawable.ad_main_2, R.drawable.ad_main_3, R.drawable.ad_main_4, R.drawable.ad_main_5, R.drawable.ad_main_6, R.drawable.ad_main_7, R.drawable.ad_main_8, R.drawable.ad_main_9, R.drawable.ad_main_10, R.drawable.ad_main_11)
    }
    // VP AD my town
    private fun getMyTownAdList(): ArrayList<Int> {
        return arrayListOf<Int>(R.drawable.ad_main_1, R.drawable.ad_main_2, R.drawable.ad_main_3, R.drawable.ad_main_4, R.drawable.ad_main_5, R.drawable.ad_main_6, R.drawable.ad_main_7, R.drawable.ad_main_8, R.drawable.ad_main_9, R.drawable.ad_main_10, R.drawable.ad_main_11)
    }
    // VP today discount
    private fun getTodayDiscount(): ArrayList<Int> {
        return arrayListOf<Int>(R.drawable.today_discount_1, R.drawable.today_discount_2, R.drawable.today_discount_3, R.drawable.today_discount_4, R.drawable.today_discount_5, R.drawable.today_discount_6, R.drawable.today_discount_7, R.drawable.today_discount_8, R.drawable.today_discount_9)
    }
}