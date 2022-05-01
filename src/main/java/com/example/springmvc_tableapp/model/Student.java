package com.example.springmvc_tableapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Student extends  Person{
    private  String index;
    private int year;

    public Student(UUID randomUUID, String firstName, String lastName, String age, Date dateOfBirth, String index, int year) {
        super(randomUUID,firstName,lastName,age,dateOfBirth);
        this.index=index;
        this.year=year;
    }
}
