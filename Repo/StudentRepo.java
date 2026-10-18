package Repo;

import java.util.List;

import Entity.Student;

public interface StudentRepo {
    List<Student> findAll();
    Student insertStudent(String studentName,String studentEmail);
}
