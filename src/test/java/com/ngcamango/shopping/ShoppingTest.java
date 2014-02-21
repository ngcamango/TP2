/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.shopping;

import com.ngcamango.shopping.config.AppConfig;
import com.ngcamango.shopping.service.ShoppingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author stud
 */
public class ShoppingTest {
    private ShoppingService shoppingService;
    
    public ShoppingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUp() throws Exception {
        ApplicationContext appC = new AnnotationConfigApplicationContext(AppConfig.class);
        shoppingService = (ShoppingService)appC.getBean("shop");
    }

    @AfterClass
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testTotalAmount() throws Exception
    {
        double result = shoppingService.totalAmount(10.00, 2);
        Assert.assertEquals(result, 20.00, 0, "This is the total amount");
    }
    
    @Test
    public void testItems() throws Exception
    {
        String product[] = {"Cake", "Chips", "Chocolate"};
        String prod[] = {"Cake", "Chips", "Chocolate"};
        
        Assert.assertEquals(product, prod);
    }
    
    @Test
    public void testIsAvailable() throws Exception
    {
        boolean answer = shoppingService.isAvailable();
        
        Assert.assertTrue(answer);
    }
    
    @Test
    public void testIsNotAvailable() throws Exception
    {
        boolean answer = shoppingService.isNotAvailable();
        
        Assert.assertFalse(answer);
    }
    
    @Test
    public void testIsNull() throws Exception
    {
        Assert.assertNull(shoppingService.isNull());
    }
    
    @Test
    public void testIsNotNull() throws Exception
    {
        Assert.assertNotNull(shoppingService.isNotNull());
    }
    
    @Test
    public void testIsTheSame() throws Exception
    {
        Assert.assertSame(shoppingService.isTheSame(), "Chocolate");
    }
    
    @Test
    public void testIsNotTheSame() throws Exception
    {
        Assert.assertNotSame(shoppingService.isNotTheSame(), "Chops");
    }
    
    @Test(timeOut = 5)
    public void testIsExpired() throws Exception
    {
           shoppingService.expired();
    }
    
    @Test
    public void prodTax() throws Exception
    {
           Assert.assertEquals(shoppingService.prodTax(), 0);
    }
}
