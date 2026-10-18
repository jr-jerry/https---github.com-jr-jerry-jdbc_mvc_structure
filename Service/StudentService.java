package Service;

import java.util.List;

import Entity.Student;

public interface StudentService {
    public List<Student> readAll();
    Student addStudent(Student obj);
    
} 
