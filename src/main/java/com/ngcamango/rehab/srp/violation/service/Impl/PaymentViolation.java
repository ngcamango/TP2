/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.srp.violation.service.Impl;

import com.ngcamango.rehab.srp.correction.service.Payment;

/**
 *
 * @author ngcamango
 */
public class PaymentViolation implements Payment{

    public double amountPaid(double amt, int days) {
        double total = 0;
        if(days > 31)
        {
            double discount = 0.20;
            double subTotal = amt * days;
            double tot = subTotal * discount;
            total = subTotal - tot;
        }
        return total;
    }
    
}
