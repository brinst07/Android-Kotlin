package com.example.edittextbuttonkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티가 최초 실행되면 이곳이 수행된다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_getText.setOnClickListener{// 에딧 텍스트에 입력되어있는 값을 가지고 와서 텍스트뷰에 뿌려준다.
            var resultText = et_id.text.toString()//에딧텍스트에 입력되어있는 값
            tv_result.setText(resultText);//입력된 값을 텍스트뷰에 set해줌
        }
    }
}