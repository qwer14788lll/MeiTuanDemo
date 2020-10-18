package com.example.meituandemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val homeDataList = ArrayList<HomeData>()

    private fun initHomeData() {
        repeat(8)
        {
            homeDataList.add(
                HomeData(
                    R.drawable.home_01,
                    "我和我的家乡",
                    "葛优,黄渤,范伟",
                    "9.3分 | 442858人观看",
                    "￥19.9",
                    "起",
                    "退",
                    "改签"
                )
            )
            homeDataList.add(
                HomeData(
                    R.drawable.home_02,
                    "数码宝贝：最后的进化",
                    "数码宝贝系列动画，历经20年的成长",
                    "88063人想看",
                    "即将上映"
                )
            )
            homeDataList.add(
                HomeData(
                    R.drawable.home_03,
                    "淼福猪肚鸡",
                    "服务真的很好呢",
                    "4.5分 | 513个评价",
                    "￥94.8",
                    "￥158.0",
                    "6折"
                )
            )
            homeDataList.add(
                HomeData(
                    R.drawable.home_04,
                    "82号古宅",
                    "葛天扈,天翼",
                    "暂无评分",
                    "￥14.9",
                    "起",
                    "改签"
                )
            )
            homeDataList.add(
                HomeData(
                    R.drawable.home_05,
                    "探蟹肉蟹煲",
                    "太好吃太划算了",
                    "4.1分",
                    "￥118",
                    "155",
                    "已减37元"
                )
            )
            homeDataList.add(
                HomeData(
                    R.drawable.home_06,
                    "嘆牛自助放题 澳洲牛肉自主放题",
                    "我觉得真的很好吃",
                    "半年售5000+ | 9.7km",
                    "￥108",
                    "138",
                    "已减30元"
                )
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //数据初始化
        initHomeData()
        //创建瀑布布局管理器
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        //设置布局管理器
        HomeRecyclerView.layoutManager = layoutManager
        //实例化数据适配器，装载数据
        val adapter = HomeDataAdapter(homeDataList)
        //将数据适配器的设置到控件上
        HomeRecyclerView.adapter = adapter
    }
}