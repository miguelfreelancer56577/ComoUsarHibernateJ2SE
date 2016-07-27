/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emploYee")
public class EmployeeAnotation {
    @Id
    @Column(name="empid", nullable = false)
    private int empId;
    private String name;
    private int age;

    public EmployeeAnotation(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.empId;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeAnotation other = (EmployeeAnotation) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmployeeAnotation{" + "empId=" + empId + ", name=" + name + ", age=" + age + '}';
    }
    
}
