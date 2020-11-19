package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener {
            //var => 변수 val => final

            var msg = tv_sendMsg.text.toString()
            // 메시지 값 읽어오기

            val intent = Intent(this, SubActivity::class.java)
            //다음화면으로 이동하기 위한 intent 객체 생성

            intent.putExtra("msg",msg)

            startActivity(intent)
            //다음화면으로 보냄
            finish()
            //현재 화면을 삭제한다.
        }
    }
}