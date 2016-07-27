/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hibernate;

import com.test.Models.CourseAnnotation;
import com.test.Models.EmployeeAnotation;
import com.test.Models.EmployeeAnotation_;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author SPPDF
 */
public class CreateSession {

    public static Session getSession() {
        SessionFactory sessionFactory = null;
        Configuration config = new Configuration().configure().addAnnotatedClass(EmployeeAnotation.class);//.addAnnotatedClass(CourseAnnotation.class);
         // Build a Registry with our configuration properties
         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
         config.getProperties()).build();

        sessionFactory = config.buildSessionFactory(serviceRegistry);
        return sessionFactory.openSession();
    }
    
}
