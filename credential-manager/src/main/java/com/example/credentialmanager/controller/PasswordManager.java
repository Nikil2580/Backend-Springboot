package com.example.credentialmanager.controller;


import com.example.credentialmanager.model.Details;
import com.example.credentialmanager.services.PasswordManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/login")
public class PasswordManager {

    @Autowired
    PasswordManagerServices passwordManagerServices;
    @PostMapping(value = "/include")
    public Details saveData(@RequestBody Details details){

        return passwordManagerServices.saveData(details);
    }

    @GetMapping(value = "/view")
    public List<Details> getData(){
        return passwordManagerServices.getData();
    }
}
