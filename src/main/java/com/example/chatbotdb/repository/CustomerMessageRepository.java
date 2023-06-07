package com.example.chatbotdb.repository;

import com.example.chatbotdb.entity.CustomerMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMessageRepository extends JpaRepository<CustomerMessage, Long> {

}
