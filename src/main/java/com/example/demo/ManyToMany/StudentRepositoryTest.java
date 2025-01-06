package com.example.demo.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentRepositoryTest {
	Scanner sc=new Scanner(System.in);
	@Autowired
	private StudentRepository studentrepository;
	public void insertDetails() {
		
		System.out.println("Please Enter How Many Addresses Do You Want to enter");
		int n=sc.nextInt();	
		List<StudentAddress> addressList = new 	ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student PinCode");
			int Pincode=sc.nextInt();
		System.out.println("Enter Student State");
		String state =sc.next();
		StudentAddress stdadd=StudentAddress.builder()
				.State(state)
				.Pincode(Pincode)
				.build();
		addressList.add(stdadd);
		}
	
		
		System.out.println("Please Enter How Many studentdetails Do You Want to insert");
		int m=sc.nextInt();	
		List<Student> studentList = new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter Student EmailId");
			String email=sc.next();
			System.out.println("Enter Student FirstName");
			String FirstName=sc.next();
			System.out.println("Enter Student LastName");
			String LastName=sc.next();
			System.out.println("Enter Student PhoneNum");
			int phNo=sc.nextInt();
		Student std=Student.builder()
				.email(email)
				.firstName(FirstName)
				.lastName(LastName)
				.phNo(phNo)
				.studentaddress(addressList)
				.build();
		studentList.add(std);
		}
		
		studentrepository.saveAll(studentList);
		
	}
//	public void printAllStudentDetails()
//	{
//		List<Student>studentdetails=studentrepository.findAll();
//		//System.out.println(studentdetails);
//		for(int i=0;i<studentdetails.size();i++)
//		{
//			System.out.println(studentdetails.get(i).getStudentaddress());
//		}
//		
//			
//	}	
	}


