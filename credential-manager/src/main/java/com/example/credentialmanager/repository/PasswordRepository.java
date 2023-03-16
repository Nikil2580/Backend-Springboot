package com.example.credentialmanager.repository;

import com.example.credentialmanager.model.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PasswordRepository extends CrudRepository<Details, String> {
    List<Details> findAll();
}
