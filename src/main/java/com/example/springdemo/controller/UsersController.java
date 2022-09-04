package com.example.springdemo.controller;


import com.example.springdemo.Test;
import com.example.springdemo.dto.UserDto;
import com.example.springdemo.models.User;
import com.example.springdemo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // nshanakuma vor inq@ veradarcnum e json
@RequestMapping("/users") // es classum inchqan zaprosner unecanq prtqa sksven "/users"-ov.
@RequiredArgsConstructor

public class UsersController {

//    @Autowired // new anelu anotatia
    private UserRepository userRepository;

//    @Autowired // new anelu anotatia
    private Test test;

//    @Autowired
//    public UsersController ( UserRepository userRepository,
//                             Test test ){
//        this.userRepository = userRepository;
//        this.test = test;
//
//    }

    @GetMapping //get zapros
    public String test(@RequestParam(name = "param1") String param1) {

        return "Hello " + param1;
    }


    @GetMapping("/{path1}") // get zapros
    public String test2(@PathVariable(name = "path1") String path1) {

        return "Hello " + path1;
    }

    @GetMapping("/withHeader/{path1}") //get zapros
    public String test3(@PathVariable(name = "path1") String path1,
                        @RequestHeader(name = "MyHeader") String myHeader) {
        String s ="";
        String s2 ="";
        String s3 ="";
        return "Hello " + path1 + ", Header " + myHeader;
    }


    @PostMapping // post zapros
    public UserDto postDemo(@RequestBody UserDto user) {
        System.out.println("++ " + user);
        return user;
    }


    @GetMapping("/all") // get zapros
    public List<User> allUsers() {
        return userRepository.findAll();
    }


    @GetMapping("/byName") // get zapros
    public List<User> allUsers(@RequestParam(name = "userName") String userName) {
        return userRepository.findAllByName(userName);
    }

//    http://localhost:9090/users/name/tttttttt/surname/vvvvv      // param
//    @GetMapping("/name/{name}/surname/{surname}")
//    public ResponseEntity test(@PathVariable(name = "name")String userName,
//                               @PathVariable(name = "surname")String userSurname)


//    http://localhost:9090/users?name=tttttttt&surname=vvvvv       // path
//    http://localhost:9090/users?surname=vvvvv  //bad request 400
//    http://localhost:9090/users?name=tttttttt
//    @GetMapping(
//    public ResponseEntity test(@RequestParam(name = "name")String userName,
//                               @RequestParam(name = "surname", required = false, defaultValue =
//                               "poxsyan")String userSurname)


//    @PutMapping("/id/{id}")                                       // body
//    public ResponseEntity test(@PathVariable(name = "id") int id,
//                               @RequestBody Object o)


}
