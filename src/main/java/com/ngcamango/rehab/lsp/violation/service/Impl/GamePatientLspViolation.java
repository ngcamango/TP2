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
public class GamePatientLspViolation extends Patient{

    @Override
    public void sleep() {
        System.out.println("Game addicts have their own sleeping routine");
    }

    @Override
    public void eat() {
        System.out.println("Game addicts have their own diet");
    }
    
}
