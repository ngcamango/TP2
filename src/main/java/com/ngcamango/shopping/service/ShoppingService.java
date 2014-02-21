/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.shopping.service;

/**
 *
 * @author stud
 */
public interface ShoppingService {
    double totalAmount(double price, int quantity);
    String items(String product[]);
    boolean isAvailable();
    boolean isNotAvailable();
    String isNull();
    String isNotNull();
    String isTheSame();
    String isNotTheSame();
    String expired();
    int prodTax();
}
