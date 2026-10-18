package Repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Student;
import Utils.ConnectionClass;

public class StudentRepoImpl implements StudentRepo {

    @Override
    public List<Student> findAll() {
        List<Student> allStudentList=new ArrayList<>();
        try(Connection connection=ConnectionClass.getConnection();
            Scanner sc=new Scanner(System.in)
            ){
            System.out.println("Connection Established ! with db ");

            // run query on mysql -->Wrap (StatmentObject)
            System.out.println("Enter user data you want to see from db");

            String query="select * from student ";

            PreparedStatement preparedStatement=connection.prepareStatement(query);

            ResultSet resultSet=preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Student student=new Student(resultSet.getString("name"),resultSet.getString("email"));
                allStudentList.add(student);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allStudentList;
    }
    @Override
    public Student insertStudent(String studentName, String studentEmail) {
        
    }
    
}
