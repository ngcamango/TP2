/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.srp.correction.service;

/**
 *
 * @author ngcamango
 */
public interface Payment {
    double amountPaid(double amt, int days);
}
