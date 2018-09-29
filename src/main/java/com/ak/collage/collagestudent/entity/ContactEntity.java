package com.ak.collage.collagestudent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud_contact")
public class ContactEntity {

    @Id
    private int id;

    @Column(name = "stud_contact_number")
    private String studentMobileNumber;

    @Column(name = "stud_email")
    private String studentEmail;

    @Column(name = "stud_parent_contact")
    private String parentContactNumber;

    @Column(name = "stud_parent_email")
    private String parentEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentMobileNumber() {
        return studentMobileNumber;
    }

    public void setStudentMobileNumber(String studentMobileNumber) {
        this.studentMobileNumber = studentMobileNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getParentContactNumber() {
        return parentContactNumber;
    }

    public void setParentContactNumber(String parentContactNumber) {
        this.parentContactNumber = parentContactNumber;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "studentMobileNumber='" + studentMobileNumber + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", parentContactNumber='" + parentContactNumber + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                '}';
    }
}
