package com.example.springmvc_tableapp.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertStudentDTO {
    private String firstName;
    private String lastName;
    private String Age;

    private Date dateOfBirth;
    private  String index;
    private int year;

}
