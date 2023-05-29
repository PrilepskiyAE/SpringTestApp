package com.prilepskiy.SpringTestApp.model

data class MessagePage(
        val page: Int,
        val mt:Map<Int,String>,
        val messages:List<Message>
)