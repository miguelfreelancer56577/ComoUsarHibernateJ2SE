/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author SPPDF
 */
@Entity(name = "course")
@Table(name = "course")
public class CourseAnnotation implements Serializable {
    @Id
    protected CoursePK id;
    @Column(name = "registered_students")
    protected int registeredStudents;
    @Column(name = "total_students")
    protected int totalStudents;

    public CourseAnnotation(CoursePK id, int registeredStudents, int totalStudents) {
        this.id = id;
        this.registeredStudents = registeredStudents;
        this.totalStudents = totalStudents;
    }

    public CourseAnnotation(String title,String tutor) {
        id = new CoursePK(title, tutor);
    }
    
}
