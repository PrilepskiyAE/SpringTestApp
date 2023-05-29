package com.prilepskiy.SpringTestApp.controllers

import com.prilepskiy.SpringTestApp.model.Message
import com.prilepskiy.SpringTestApp.model.MessagePage
import com.prilepskiy.SpringTestApp.service.MessageService
import org.springframework.web.bind.annotation.*

//@RestController
//class MessageController(val service: MessageService) {
//    @GetMapping("/")
//    fun index(@RequestParam("name") name: String,index:Int) = "Hello,$index <-|-> $name"
////    @GetMapping("/MessageTest")
////    fun index()= listOf<Message>(
////            Message("0","R0"),
////            Message("1","R1"),
////            Message("2","R2"),
////            Message("3","R3"),
////            Message("4","R4"),
////            Message("5","R5")
////    )
//
//    @PostMapping("/")
//    fun post(@RequestBody message: Message) {
//        service.save(message)
//    }
//
////    @GetMapping("/MessageList")
////    fun index(@RequestParam("page") page: Int)=MessagePage(page, mt =  mapOf<Int,String>(
////            0 to "MR",
////            1 to "MR",
////            2 to "MR",
////            3 to "MR"
////
////    ), listOf(
////            Message("0","R0"),
////            Message("1","R1"),
////            Message("2","R2"),
////            Message("3","R3"),
////            Message("4","R4"),
////            Message("5","R5")
////    ))
//
//    @GetMapping("/")
//    fun index(): List<Message> = service.findMessages()
//    @GetMapping("/{id}")
//    fun index(@PathVariable id: String): List<Message> =
//            service.findMessageById(id)
//}

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun index(): List<Message> = service.findMessages()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> =
            service.findMessageById(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
}