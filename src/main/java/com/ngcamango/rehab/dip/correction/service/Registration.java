/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.dip.correction.service;

/**
 *
 * @author ngcamango
 */
public interface Registration {
    String patient(String name, String surname, int age, String diagnosis);
    boolean isMinor(int age);
}
