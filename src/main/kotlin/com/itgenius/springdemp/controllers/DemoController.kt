package com.itgenius.springdemp.controllers

import com.itgenius.springdemp.models.DemoData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class DemoController {

    //Method GET
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello Spring Demo!"
    }

    @GetMapping("/about")
    fun about(): String {
        return "about"
    }

    @GetMapping("/demodata")
    fun  getDemoData(): List<DemoData> {
        return listOf(
            DemoData(1,"name","name@gmail","09844444","Thai"),
            DemoData(2,"name","name@gmail","09844444","Thai")
        );
    }

    @GetMapping("/demodata/{id}")
    fun  getDemoDataById(@PathVariable id:Int): DemoData {
        return DemoData(id,"name","name@gmail","09844444","Thai")
    }

}