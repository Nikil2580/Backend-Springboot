package com.example.credentialmanager.services;

import com.example.credentialmanager.model.Details;

import java.util.List;

public interface PasswordManagerServices {
    Details saveData(Details details);
    List<Details> getData();
}
