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
public class Profesor extends Person{
    private Double salary;
    private int years_of_experience;

    public Profesor(UUID randomUUID, String firstName, String lastName, String age, Date dateOfBirth, Double salary, int years_of_experience) {
        super(randomUUID,firstName,lastName,age,dateOfBirth);
        this.salary=salary;
        this.years_of_experience=years_of_experience;
    }
}
