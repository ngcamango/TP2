/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.dip;

import com.ngcamango.rehab.config.AppConfig;
import com.ngcamango.rehab.dip.correction.service.Registration;
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
public class TestDipCorrection extends TestCase {
    private Registration re;
    
    public TestDipCorrection(String testName) {
        super(testName);
    }
    
    @BeforeMethod
    protected void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        re = (Registration)ctx.getBean("dipCorrect");
    }
    
    @AfterMethod
    protected void tearDown() throws Exception {
        
    }
    
    @Test
    public void testPatient() throws Exception{
        String patient = re.patient("Siyanda", "Dlephu", 27, "Sexting");
        Assert.assertEquals("SiyandaDlephu27Sexting", patient, "String: ");
    }
}
