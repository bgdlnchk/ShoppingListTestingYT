package com.androiddevs.shoppinglisttestingyt.data.remote.respones

data class ImageResponse (
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)