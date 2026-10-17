package Controller;

import java.util.List;

import Entity.Student;
import Service.StudentService;

public class Controller {
    private StudentService studentService;
    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }
    public List<Student> getAll(){
        return studentService.readAll();
    }
}
