package com.example.springmvc_tableapp.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data

public abstract class Person {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String age;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date dateOfBirth;
}
