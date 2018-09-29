package com.ak.collage.collagestudent.model;

public class Contact {

    private String studentMobileNumber;

    private String studentEmail;

    private String parentContactNumber;

    private String parentEmail;

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
