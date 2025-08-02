package com.codeio.sample;

import org.springframework.stereotype.Component;

@Component //or @Bean instead
public class TodoRepository {

    String getAllTodos() {
        return "Todos";
    }
}
