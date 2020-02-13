package com.example.first_encounter.repos;

import com.example.first_encounter.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

  List<Message> findByTag(String tag);

}