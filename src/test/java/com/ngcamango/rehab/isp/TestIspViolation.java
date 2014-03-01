/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.isp;

import com.ngcamango.rehab.config.AppConfig;
import com.ngcamango.rehab.isp.correction.service.Registration;
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
public class TestIspViolation extends TestCase {
    private Registration re;
    
    public TestIspViolation(String testName) {
        super(testName);
    }
    
    @BeforeMethod
    protected void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        re = (Registration)ctx.getBean("ispViolation");
    }
    
    @AfterMethod
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testHello() throws Exception{
        boolean result = re.isMinor(16);
        Assert.assertTrue(result);
    }
}
