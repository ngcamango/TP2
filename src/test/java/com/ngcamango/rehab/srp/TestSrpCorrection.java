/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.srp;

import com.ngcamango.rehab.config.AppConfig;
import com.ngcamango.rehab.srp.correction.service.Payment;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ngcamango
 */
public class TestSrpCorrection extends TestCase {
    private Payment pay;
    
    public TestSrpCorrection(String testName) {
        super(testName);
    }
    
    @BeforeMethod
    protected void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pay = (Payment)ctx.getBean("srpCorrect");
    }
    
    @AfterMethod
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    @Test
    public void testAmountPaid() throws Exception{
        double amount = pay.amountPaid(189.00, 15);
        Assert.assertEquals(2835.00, amount);
    }
}
