/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.isp.correction.service.Impl;

import com.ngcamango.rehab.isp.correction.service.Registration;

/**
 *
 * @author ngcamango
 */
public class RegistrationIspCorrect implements Registration{
    public String patient(String name, String surname, int age, String diagnosis)
    {
        name = "Pablo";
        surname = "Lephatsoe";
        age = 27;
        diagnosis = "Alcohol";
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
