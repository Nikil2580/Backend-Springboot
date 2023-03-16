package com.example.credentialmanager.services.impl;

import com.example.credentialmanager.model.Details;
import com.example.credentialmanager.services.PasswordManagerServices;
import com.example.credentialmanager.services.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordManagerServiceImpl implements PasswordManagerServices {

    @Autowired
    PasswordRepository passwordRepository;
    @Override
    public Details saveData(Details details) {
        return passwordRepository.save(details);
    }

    @Override
    public List<Details> getData() {
        List<Details> list = passwordRepository.findAll();
        for(Details details : list){
            details.setPassword("");
        }
        return list;
    }

}
