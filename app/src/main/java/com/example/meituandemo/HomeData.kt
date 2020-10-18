package com.example.meituandemo

/**
 * 首页数据实体类
 * imageId：图片资源ID
 * Title：主标题
 * Subtitle：次标题
 * DataTitle：数据标题
 * PresentPrice：现价
 * OriginalPrice：原价
 * Label1：标签1
 * Label2：标签2
 */
class HomeData(
    val imageId: Int,
    val mainTitle: String,
    val subtitle: String,
    val dataTitle: String,
    val presentPrice: String,
    val originalPrice: String = "",
    val label1: String = "",
    val label2: String = ""
)