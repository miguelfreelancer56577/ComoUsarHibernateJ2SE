/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SPPDF
 */
@Embeddable
public class CoursePK implements Serializable {
    @Column(name = "title", nullable = false, unique = true)
    private String title;
    @Column(name = "tutor", nullable = false, unique = true)
    private String tutor;

    public CoursePK(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "CoursePK{" + "title=" + title + ", tutor=" + tutor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.title);
        hash = 23 * hash + Objects.hashCode(this.tutor);
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
        final CoursePK other = (CoursePK) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.tutor, other.tutor)) {
            return false;
        }
        return true;
    }
    
}
