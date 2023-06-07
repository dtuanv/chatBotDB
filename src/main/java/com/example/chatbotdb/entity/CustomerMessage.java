package com.example.chatbotdb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class CustomerMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String input;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<StepAsk> stepAskSet;

}
