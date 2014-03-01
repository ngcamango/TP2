/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngcamango.rehab.ocp.correction.service.Impl;

import com.ngcamango.rehab.ocp.correction.service.Registration;

/**
 *
 * @author ngcamango
 */
public class RegisterPatientCorrection implements Registration {

    public String patient(String name, String surname, int age, String diagnosis)
    {
        name = "Sandisiwe";
        surname = "Vutula";
        age = 20;
        diagnosis = "Too much cigarette smoking";
        return null;
    }

    public boolean isMinor(int age) {
        if(age < 18)
        {
            return true;
        }
        return false;
    }
}
