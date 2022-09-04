package com.example.springdemo.repositories;

import com.example.springdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // es anotacian nshanakuma vor inq@ springi hamar bina darcnum mer User@ vori id Integer tipiya
public interface UserRepository  extends JpaRepository<User, Integer> {

    List<User> findAllByName(String name);

    List<User> findAllByAgeAndName(int age, String name);
}
