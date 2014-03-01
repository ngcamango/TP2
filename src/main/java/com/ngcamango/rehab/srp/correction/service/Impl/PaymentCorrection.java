/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.srp.correction.service.Impl;

import com.ngcamango.rehab.srp.correction.service.Payment;

/**
 *
 * @author ngcamango
 */
public class PaymentCorrection implements Payment{

    public double amountPaid(double amt, int days) {
        return amt * days;
    }
    
    
}
