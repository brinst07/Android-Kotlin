package com.example.listviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

// 리스트뷰는 반드시 어댑터로 연결해줘야한다.
// 어댑터로 연결되었을때 getView로 실행된다.
class UserAdapter (val context: Context,val UserList: ArrayList<User>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // View를 가지고 왔을때 어떻게 뿌려줄거냐..
        // 뷰를 붙일때 layoutinflate
        // layoutinflater는 xml에 정의된 resource를 view 객체로 반환해주는 역할을 한다.
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user,null)

        val profile = view.findViewById<ImageView>(R.id.iv_profile)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val age = view.findViewById<TextView>(R.id.tv_age)
        val greet = view.findViewById<TextView>(R.id.tv_greet)

        val user = UserList[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet
        // view를 꼭 리턴해줘야한다.
        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }

}