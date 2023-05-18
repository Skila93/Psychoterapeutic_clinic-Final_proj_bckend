package com.kodilla.psychoterapeutic_clinic_bckend.emailValidation;

import com.kodilla.psychoterapeutic_clinic_bckend.Exceptions.IncorrectEmailFormaException;

import java.util.regex.*;

public class EmailValidator {
    public static String regexPattern = "^(.+)@(\\S+)$";

    public static Boolean emailValidation(String email) {
        if (Pattern.compile(regexPattern).matcher(email).matches()) {
            return true;
        } else return false;
    }
}