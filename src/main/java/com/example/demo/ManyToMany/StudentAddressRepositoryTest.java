package com.example.demo.ManyToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentAddressRepositoryTest {
	
		Scanner sc=new Scanner(System.in);
		@Autowired
		private StudentAddressRepository studentAddressrepository;
		public void insertDetails() {
			System.out.println("Enter Student EmailId");
			String email=sc.nextLine();
			System.out.println("Enter Student FirstName");
			String FirstName=sc.nextLine();
			System.out.println("Enter Student LastName");
			String LastName=sc.nextLine();
			System.out.println("Enter Student PhoneNum");
			int phNo=sc.nextInt();
			System.out.println("Please Enter How Many Addresses Do You Want");
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
			Student std=Student.builder()
					.email(email)
					.firstName(FirstName)
					.lastName(LastName)
					.phNo(phNo)
					.studentaddress(addressList)
					.build();
			//studentAddressrepository.saveAll(std);

			}
		public void printAllStudentDetails()
		{
			List<StudentAddress>studentdetails=studentAddressrepository.findAll();
			System.out.println(studentdetails);
		}	
		}




