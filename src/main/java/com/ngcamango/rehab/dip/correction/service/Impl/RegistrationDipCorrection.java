/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.dip.correction.service.Impl;

import com.ngcamango.rehab.dip.correction.service.Registration;

/**
 *
 * @author ngcamango
 */
public class RegistrationDipCorrection implements Registration{
    public String patient(String name, String surname, int age, String diagnosis)
    {
        name = "Siyanda";
        surname = "Dlephu";
        age = 27;
        diagnosis = "Sexting";
        
        String pat = (name+""+surname+""+age+""+diagnosis);
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
