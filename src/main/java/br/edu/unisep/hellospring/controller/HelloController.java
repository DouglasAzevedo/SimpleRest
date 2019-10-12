package br.edu.unisep.hellospring.controller;

import br.edu.unisep.hellospring.model.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @GetMapping
    public MessageDto sayHello() {
        return new MessageDto("Hello, Spring!", "you");
    }

    @PostMapping
    public void receiveMessage(@RequestBody MessageDto message) {
        System.out.println("Message received: ");
        System.out.println(message.getDestination());
        System.out.println(message.getContent());
    }

}
