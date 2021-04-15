package pjh.mjc.kotlin4

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("리스트뷰 테스트 as 코틀린")

        val mid : Array<String> = arrayOf(
            "히어로즈", "24시", "로스트", "로스트룸", "스몰별", "탐정몽크",
            "빅뱅이론", "프렌즈", "덱스터", "글리", "가쉽걸", "테이큰", "슈퍼내추럴", "브이"
        )
        val listView = findViewById<View>(R.id.listView1) as ListView
        val adapter = MyListAdapter(this, mid)
        listView.adapter = adapter
    }
}