package com.ak.collage.collagestudent.service;

import com.ak.collage.collagestudent.model.Contact;
import com.ak.collage.collagestudent.model.Student;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudentDetails(int id);

    Student updateStudent(Student student);

    Contact getContactDetails(int id);

    Contact updateContact(Contact contact);
}
