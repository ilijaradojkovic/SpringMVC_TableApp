package com.example.springmvc_tableapp.Repository;

import com.example.springmvc_tableapp.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface StudentRepository extends MongoRepository<Student, UUID> {
}
