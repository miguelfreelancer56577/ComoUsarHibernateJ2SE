package com.test.Run;

import com.test.Models.CourseAnnotation;
import com.test.Models.CourseAnnotation_;
import com.test.Models.CoursePK;
import com.test.Models.Employee;
import com.test.Models.EmployeeAnotation;
import com.test.hibernate.CreateSession;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SPPDF
 */
public class Principal {
    public static void main(String[] args) {
            Transaction tx = null;
            Session session = null;
        try {
            session = CreateSession.getSession();
            tx = session.beginTransaction();
//            CoursePK pk = new CoursePK("Programacion en Java", "delteil");
            CourseAnnotation course = new CourseAnnotation("C++", "Miguel");
//            CourseAnnotation course = new CourseAnnotation(pk, 5, 5);
            session.save(course);
    //        persistence with AJO
//            EmployeeAnotation emAnot = new EmployeeAnotation("manuel estrada solis", 34);
//            session.save(emAnot);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)              
                tx.rollback();
            throw e;
        }finally{
            session.close();
        }
//        Employee employee = new Employee();
//        employee.setName("Pedro Hernanadez Molina");
//        employee.setAge("34");
//        CreateSession sessionHibernate = new CreateSession();
//        Session session = sessionHibernate.getSessionFactory();
//        session.beginTransaction();
//        session.save(employee);
//        employee = (Employee)session.load(Employee.class, 1);
//        System.out.println("Employee:"+employee);
////        all rows
//        List<Employee> empleados = new ArrayList<>();
//        empleados = session.createQuery("from Employee").list();
////        print all employees
//        System.err.println("liste empleados "+ empleados);
//        session.getTransaction().commit();
    }
}
