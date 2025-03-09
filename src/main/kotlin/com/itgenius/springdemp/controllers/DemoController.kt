package com.itgenius.springdemp.controllers

import com.itgenius.springdemp.models.DemoData
import org.springframework.web.bind.annotation.*

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

    //Get By ID
    @GetMapping("/demodata/{id}")
    fun  getDemoDataById(@PathVariable id:Int): DemoData {
        return DemoData(id,"name","name@gmail","09844444","Thai")
    }

    //Get with optional parameter
    @GetMapping("/demodata2/search")
    fun getDemoDataWithOptionalParam(
        @RequestParam(required = false, defaultValue = "") name: String
    ): DemoData {
        val userName = if (name.isEmpty()) "Guest" else name
        return DemoData(1, userName, "name@gmail.com", "09844444", "Thai")
    }


    //POST Method
    @PostMapping("/demodata")
    fun createDemoData(@RequestBody demoData: DemoData): DemoData {
        return  demoData
    }

    //PUT Method
    @PutMapping("/demodata/{id}")
    fun updateDemoData(@RequestBody demoData: DemoData,@PathVariable id:Int): DemoData {
        return  demoData.copy(id=id)
    }

    //Delte Method
    @DeleteMapping("demodata/{id}")
    fun deleteDemoData(@PathVariable id:Int): String {
        return  "Delete Id: ${id}"
    }

}