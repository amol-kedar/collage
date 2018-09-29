package com.ak.collage.collagestudent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stud_1")
public class StudentEntity {

    @Id
    @Column(name = "stud_1")
    private int id;

    @Column(name = "stud_first_name")
    private String firstName;

    @Column(name = "stud_last_name")
    private String lastName;

    @Column(name = "stud_middle_name")
    private String middleName;

    @Column(name = "stud_class")
    private int studentClass;

    @Column(name = "stud_div")
    private char div;

    @Column(name = "stud_address_1")
    private String address1;

    @Column(name = "stud_address_2")
    private String address2;

    @OneToOne
    private ContactEntity studentContact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public char getDiv() {
        return div;
    }

    public void setDiv(char div) {
        this.div = div;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public ContactEntity getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(ContactEntity studentContact) {
        this.studentContact = studentContact;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", studentClass=" + studentClass +
                ", div=" + div +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                '}';
    }
}
