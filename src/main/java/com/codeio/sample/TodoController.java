package com.codeio.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

//    @GetMapping("/get")
//    String getTodo() {
//        return "Todo";
//    }

    @Autowired
    private TodoService todoService;
    @GetMapping("/get")
    String getTodo() {
        todoService.printTodos();
        return "Todo";
    }

    //Path Variable
    @GetMapping("/{id}")
    String getTodoId(@PathVariable long id) {
        return "Todo with Id " +id;
    }

    //Request Param
    @GetMapping("")  //No need to mention -> ("") *coz its empty
    String getTodoIdParamEx(@RequestParam("todoId") long id) {
        return "Todo with Id " +id;
    }

    //This is not the way to do this
    @GetMapping("/example")
    String getTodoIdParamEx(@RequestParam String userID, @RequestParam String password) {
        return "Todo userID: " + userID + " " + "Password: " + password;
    }

    //Request Body
    @PostMapping("/create")
    String createUser(@RequestBody String body) {
        return body;
    }

    @PutMapping("/{id}")
    String updateId(@PathVariable long id) {
        return "Update Todo with Id: " +id;
    }

    @DeleteMapping("/{id}")
    String deleteId(@PathVariable long id) {
        return "Delete Todo with Id: " +id;
    }
}
