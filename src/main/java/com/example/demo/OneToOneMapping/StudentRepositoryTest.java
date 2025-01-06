package com.example.demo.OneToOneMapping;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentrepository;
Scanner sc=new Scanner(System.in);
	public void printAllStudentDetails()
	{
		List<Student>studentdetails=studentrepository.findAll();
		System.out.println(studentdetails);
	}	
	public void deleteStudent()
	{
		System.out.println("Enter the Student id to delete");
		int id=sc.nextInt();
		
		Optional<Student> studentOpt = studentrepository.findById(Long.valueOf(String.valueOf(id)));
		if(studentOpt.isPresent()) {
			Student student = studentOpt.get();
			studentrepository.delete(student);
		}		
//		int k=studentrepository.deleteStudentById(id);       
//		if(k==1)
//		{
//			System.out.println("Student details deleted successfully!");
//		}
//		else
//		{
//			System.out.println("Please Enter Correct id");
//		}	
	}
	}


