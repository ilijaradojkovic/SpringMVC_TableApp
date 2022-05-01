package com.example.springmvc_tableapp.Repository;

import com.example.springmvc_tableapp.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProfesorRepository extends MongoRepository<Profesor, UUID> {
}
