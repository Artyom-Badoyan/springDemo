package com.example.springdemo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {

    private String name;
    private String surname;
    private int  age;

}
