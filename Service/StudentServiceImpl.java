package Service;

import java.util.List;

import Entity.Student;
import Repo.StudentRepo;

public class StudentServiceImpl implements StudentService{
    private StudentRepo studentRepo;
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @Override
    public List<Student> readAll() {
       return studentRepo.findAll();
    }
    
}