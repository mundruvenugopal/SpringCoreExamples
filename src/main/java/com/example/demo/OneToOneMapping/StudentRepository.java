package com.example.demo.OneToOneMapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface StudentRepository extends JpaRepository<Student,Long>{
	
	
	//@Query(
		//nativeQuery=true,
		//	value="delete FROM student_one_to_one s WHERE s.id=:id"	
		//	)
	@Transactional
	@Modifying
	@Query("delete from Student s where s.id=:id")
	int deleteStudentById(int id);

	
	
	
			//@Query("SELECT s FROM Student s where s.id=:id")
		  //  List<Student> getStudentById(int id);
			
			
			
}
