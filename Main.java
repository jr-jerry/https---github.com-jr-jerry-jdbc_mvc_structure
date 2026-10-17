import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Controller.Controller;
import Repo.StudentRepo;
import Repo.StudentRepoImpl;
import Service.StudentService;
import Service.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
       StudentRepo studentRepo=new StudentRepoImpl();
       StudentService studentService=new StudentServiceImpl(studentRepo);
       Controller controller=new Controller(studentService);

       System.out.println(controller.getAll());
    }
}