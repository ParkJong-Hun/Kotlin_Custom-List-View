package pjh.mjc.kotlin4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyListAdapter(val context:Context, val title:Array<String>): BaseAdapter() {
    override fun getCount(): Int {
        return title.count()
    }
    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var temp : View? = convertView
        temp = inflater.inflate(R.layout.custom_adapter, parent, false)

        var text1 : TextView = temp.findViewById(R.id.tv1)
        var text2 : TextView = temp.findViewById(R.id.tv2)
        text1.setText(title[position])
        text2.setText(title[position] + "의 내용")
        return temp
    }

}