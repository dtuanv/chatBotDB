package com.example.chatbotdb.controller;

import com.example.chatbotdb.entity.CustomerMessage;
import com.example.chatbotdb.repository.CustomerMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CustomerMessageController {
  final  CustomerMessageRepository customerMessageRepository;

    @PostMapping("/saveMessage")
    @CrossOrigin
    private void saveMessage(@RequestBody CustomerMessage customerMessage){
//      System.out.println("customerMessage "+customerMessage.getInput());
        customerMessageRepository.save(customerMessage);
    }

    @GetMapping("/getQuestion")
    @CrossOrigin
  private Set<CustomerMessage> getQuestion(){
    return  customerMessageRepository.findAll().stream().collect(Collectors.toSet());
    }
}
