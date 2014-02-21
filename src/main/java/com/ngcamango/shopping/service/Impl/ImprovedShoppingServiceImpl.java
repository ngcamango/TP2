/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.shopping.service.Impl;

import com.ngcamango.shopping.service.ShoppingService;

/**
 *
 * @author stud
 */
public class ImprovedShoppingServiceImpl implements ShoppingService {

    @Override
    public double totalAmount(double price, int quantity) {
        if(quantity > 0)
        {
            return price * quantity; 
        }
        return 0;
    }

    @Override
    public String items(String[] product) {
        int cnt = 0;
        for(int i=0; i<product.length; i++)
        {
            cnt = i;
        }
        return product[cnt];    
    }

    @Override
    public boolean isAvailable() {
        boolean ans = true;
        return ans;
    }
    
    @Override
    public boolean isNotAvailable() {
        boolean ans = false;
        return ans;
    }
    
    @Override
    public String isNull() {
       
        return null;
    }
    
    @Override
    public String isNotNull() {
        String prod = "Chips";
        return prod;
    }
    
    @Override
    public String isTheSame() {
        
        String prod = "Chocolate";
        return prod; 
    }
    
    @Override
    public String isNotTheSame() {
        
        String prod = "Chips";
        return prod; 
    }
    
    @Override
    public String expired() {
        int product = 0;
        String message;
       
        if(product > 5)
            message = "Chips have expired";
        else
            message = "Not expired";
        return message;
    }
    
    @Override
    public int prodTax() {
        int prod = 5;
        double tax = 0.14;
        int bal = (int) (prod * tax);
        return bal;  
    }
}
