package com.codeio.sample;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//BEAN - object that is in java but that is managed by spring
@Service    //for service classes we use @Service instead of @Bean
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

//    public TodoService() {
//        todoRepository = new TodoRepository();
//    }
// It will automatically handled by spring.. using @Autowired

    public void printTodos() {
        System.out.println(todoRepository.getAllTodos());
    }

}
