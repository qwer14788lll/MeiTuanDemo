package com.example.meituandemo

import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeDataAdapter(private val homeDataList: List<HomeData>) :
    RecyclerView.Adapter<HomeDataAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgID: ImageView = view.findViewById(R.id.HomeImage)
        val mainTitle: TextView = view.findViewById(R.id.HomeMainTitle)
        val subTitle: TextView = view.findViewById(R.id.HomeSubtitle)
        val dataTitle: TextView = view.findViewById(R.id.HomeDataTitle)
        val presentPrice: TextView = view.findViewById(R.id.HomePresentPrice)
        val originalPrice: TextView = view.findViewById(R.id.HomeOriginalPrice)
        val label1: TextView = view.findViewById(R.id.HomeLabel1)
        val label2: TextView = view.findViewById(R.id.HomeLabel2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            parent.context.startActivity(Intent(parent.context, MainActivity::class.java))
        }
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val homeData = homeDataList[position]
        holder.imgID.setImageResource(homeData.imageId)
        holder.mainTitle.text = homeData.mainTitle
        holder.subTitle.text = homeData.subtitle
        holder.dataTitle.text = homeData.dataTitle
        holder.presentPrice.text = homeData.presentPrice
        holder.originalPrice.text = homeData.originalPrice
        if (homeData.originalPrice != "起") {
            //添加删除线
            holder.originalPrice.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG
        }
        //数据为空则隐藏该控件(不占据空间)
        if (homeData.label1 == "") {
            holder.label1.visibility = View.GONE
        } else {
            holder.label1.text = homeData.label1
        }
        if (homeData.label2 == "") {
            holder.label2.visibility = View.GONE
        } else {
            holder.label2.text = homeData.label2
        }
    }

    override fun getItemCount() = homeDataList.count()
}