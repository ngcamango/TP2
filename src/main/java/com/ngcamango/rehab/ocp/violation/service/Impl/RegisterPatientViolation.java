/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.ocp.violation.service.Impl;

import com.ngcamango.rehab.ocp.correction.service.Registration;

/**
 *
 * @author ngcamango
 */
public class RegisterPatientViolation implements Registration{
    public String patient(String name, String surname, int age, String diagnosis)
    {
        name = "Sandisiwe";
        surname = "Vutula";
        age = 20;
        diagnosis = "Too much cigarette smoking";
        if(isMinor(age) == true)
        {
            String pat = ("Name:"+name+"Surname:"+surname+"age"+age+"Diagnosis:"+diagnosis+"Minor");
            return pat;
        }
        String pat = ("Name:"+name+"Surname:"+surname+"age"+age+"Diagnosis:"+diagnosis+"Minor");
        return pat;
    }

    public boolean isMinor(int age) {
        if(age < 18)
        {
            return true;
        }
        return false;
    }
}
