package priv.sunmd.app.example.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/example")
class ExampleController {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World!"
    }

    @GetMapping("/param")
    fun requestParam(@RequestParam(name = "name", required = false, defaultValue = "John") name: String): String {
        return ("Hello $name")
    }

    @GetMapping("/{id}")
    fun pathVar(@PathVariable id: Int): String {
        return ("id: $id")
    }
}