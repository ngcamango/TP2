/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.shopping.config;

import com.ngcamango.shopping.service.Impl.ImprovedShoppingServiceImpl;
import com.ngcamango.shopping.service.Impl.ShoppingServiceImpl;
import com.ngcamango.shopping.service.ShoppingService;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author stud
 */
public class AppConfig {
    @Bean(name="shop")
    public ShoppingService getService()
    {
        return new ShoppingServiceImpl();
    }
    
    @Bean(name="Extshop")
    public ShoppingService getImprovedService()
    {
        return new ImprovedShoppingServiceImpl();
    }
}
