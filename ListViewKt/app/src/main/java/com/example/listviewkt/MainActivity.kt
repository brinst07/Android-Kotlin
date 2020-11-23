package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "박희찬", "27", "안녕하세요 반갑습니다."),
        User(R.drawable.android2, "오서현", "23", "안녕하세요 오서현입니다."),
        User(R.drawable.android2, "아기장수우투리", "23", "안녕하세요 아기장수우투리입니다."),
        User(R.drawable.android2, "오토리", "23", "안녕하세요 오토리입니다."),
        User(R.drawable.android2, "귀요미서현", "23", "안녕하세요 귀요미서현입니다."),
        User(R.drawable.android2, "호기심뭉치", "23", "안녕하세요 호기심뭉치입니다.")
    )

    override fun onCreate(savedInstanceState: Bundle?) { //액티비티의 실행 시작지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과","배","딸기","키위")
//        // context란 한 액티비티의 모든 정보를 담고 있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,item)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val selectItem = parent.getItemAtPosition(position) as User
                Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()

            }
    }
}