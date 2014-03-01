/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.isp.violation.service.Impl;

/**
 *
 * @author ngcamango
 */
public class RegistrationIspViolation2{
    RegistrationIspViolation regi = new RegistrationIspViolation();
    
    public boolean isMinor(int age) {
        if(age < 18)
        {
            return true;
        }
        return false;
    }
}
