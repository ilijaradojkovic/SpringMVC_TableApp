package com.example.springmvc_tableapp.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsertProfesorDTO {
    private String firstName;
    private String lastName;
    private String Age;

    private Date dateOfBirth;
    private Double salary;
    private int years_of_experience;
}
