/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.dip.violation.service.Impl;

import com.ngcamango.rehab.dip.correction.service.Impl.RegistrationDipCorrection;
import com.ngcamango.rehab.dip.correction.service.Registration;

/**
 *
 * @author ngcamango
 */
public class RegistrationDipViolation extends RegistrationDipCorrection implements Registration{
    @Override
    public String patient(String name, String surname, int age, String diagnosis)
    {
        name = "Siyanda";
        surname = "Dlephu";
        age = 27;
        diagnosis = "Sexting";
        if(isMinor(age) == true)
        {
            String pat = (""+name+""+surname+""+age+""+diagnosis+"Minor");
            return pat;
        }
        String pat = (""+name+""+surname+""+age+""+diagnosis+"Adult");
        return pat;
    }

    @Override
    public boolean isMinor(int age) {
        if(age < 18)
        {
            return true;
        }
        return false;
    }
    
}
