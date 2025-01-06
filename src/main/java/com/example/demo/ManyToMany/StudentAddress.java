package com.example.demo.ManyToMany;
//import com.example.demo.OneToOneMapping.Student;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Entity
@Data
@Table(name="StudentAddressManyToMany")
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int StudentAddressId;
	private int Pincode;
	private String State;
	

	@ManyToMany(
			
			cascade= {CascadeType.ALL},
			fetch=FetchType.EAGER
			)
	
	@JoinTable(
					name="Student_address_map",
					joinColumns=@JoinColumn(
							name="studentaddress_id"
							
					),
					inverseJoinColumns=@JoinColumn(
							name="student_id"
						
							)
			)
	private List<Student> student;
	
}
