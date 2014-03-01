/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.lsp.violation.service.Impl;

/**
 *
 * @author ngcamango
 */
public class AlcoholPatientLspViolation extends Patient{

    @Override
    public void medication() {
        System.out.println("Alcoholics can be on medication");
    }

    @Override
    public void sleep() {
        System.out.println("Alcoholics have their own sleeping routine");
    }

    @Override
    public void eat() {
        System.out.println("Alcoholics have their own diet");
    }
    
}
