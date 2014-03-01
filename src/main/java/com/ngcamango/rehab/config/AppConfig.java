/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehab.config;

import com.ngcamango.rehab.dip.correction.service.Impl.RegistrationDipCorrection;
import com.ngcamango.rehab.dip.violation.service.Impl.RegistrationDipViolation;
import com.ngcamango.rehab.isp.correction.service.Impl.RegistrationIspCorrect;
import com.ngcamango.rehab.isp.violation.service.Impl.RegistrationIspViolation;
import com.ngcamango.rehab.ocp.correction.service.Impl.RegisterPatientCorrection;
import com.ngcamango.rehab.ocp.violation.service.Impl.RegisterPatientViolation;
import com.ngcamango.rehab.srp.correction.service.Impl.PaymentCorrection;
import com.ngcamango.rehab.srp.violation.service.Impl.PaymentViolation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ngcamango
 */
@Configuration
public class AppConfig {
    @Bean(name="ocpCorrect")
    public RegisterPatientCorrection getOCPCorrectService(){
        return new RegisterPatientCorrection();
    }
    @Bean(name="ocpViolation")
    public RegisterPatientViolation getOCPViolationService(){
        return new RegisterPatientViolation();
    }
    
    @Bean(name="dipCorrect")
    public RegistrationDipCorrection getDipCorrectService(){
        return new RegistrationDipCorrection();
    }
    @Bean(name="dipViolation")
    public RegistrationDipViolation getDipViolationService(){
        return new RegistrationDipViolation();
    }
    
    @Bean(name="srpCorrect")
    public PaymentCorrection getSrpCorrectService(){
        return new PaymentCorrection();
    }
    @Bean(name="srpViolation")
    public PaymentViolation getSrpViolationService(){
        return new PaymentViolation();
    }
    
    @Bean(name="ispCorrect")
    public RegistrationIspCorrect getIspCorrectService(){
        return new RegistrationIspCorrect();
    }
    @Bean(name="ispViolation")
    public RegistrationIspViolation getIspViolationService(){
        return new RegistrationIspViolation();
    }
}
