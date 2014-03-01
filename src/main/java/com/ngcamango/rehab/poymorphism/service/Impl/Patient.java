/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.poymorphism.service.Impl;

/**
 *
 * @author ngcamango
 */
public class Patient {
    private String name;
    private String surname;
    private int age;
    private String diagnosis;

    public Patient(String name, String surname, int age, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    
}
