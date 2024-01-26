package com.cleo.Rest_API.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {

    private int id;

    private String name;

    private int roll_number;

    @Override
    public String toString () {
        return "name: " + name + " Roll Number: " + roll_number;
    }
}
