package com.allmichel.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indicar que queremos uma classe controladora
@RequestMapping("/api/v1/books")//mapear o endereco da nossa controladora
public class BookController {
    @GetMapping //Pra indicar que estamos usando uma requisição do tipo rest
    public String hello(){
        return "Hello Bookstore Manager";
    }
}
