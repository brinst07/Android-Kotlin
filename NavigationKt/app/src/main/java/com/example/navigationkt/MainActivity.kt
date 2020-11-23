package com.example.navigationkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_navi.setOnClickListener {
            layout_drawer.openDrawer(GravityCompat.START) // START : left와 같은 말, END : right와 같은 말
        }

        naviView.setNavigationItemSelectedListener(this) // 네비에기션 메뉴 아이템에 클릭 속성 부여 제일 중요함
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {//네비게이션 메뉴 아이템 클릭 시 수행
        when (item.itemId) {
            //ActivityContext : Activity의 라이프 사이클에 따라 쉽게 사라지고 다시 만들수 있다.
            //ApplicationContext : 프로세스의 라이프 사이클을 따르게 때문에 앱이 죽기 전까지 singltone instace로 동일한 객체 반환
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "메시지", Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers() // 네비게이션 뷰 닫기
        return false
    }

    //Ctrl+O 추천 오버라이드 메소드드
   override fun onBackPressed() {
        // 백버튼을 눌렀을 때 앱이 꺼지는 문제 해결
        if (layout_drawer.isDrawerOpen(GravityCompat.START)) {
            layout_drawer.closeDrawers()
        } else {
            super.onBackPressed() // 일반 백버튼 기능 실행
        }
    }
}