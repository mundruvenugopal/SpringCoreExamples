package com.example.demo.OneToOneMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
public interface StudentAddressRepository extends JpaRepository<StudentAddress,Long>{
//	@Query("SELECT s FROM StudentAddress s")
//    List<StudentAddress> findAllStudents();
//	@Transactional
//	@Modifying
//	@Query(
//			nativeQuery=true,
//			value="delete FROM student_address_one_to_one s WHERE s.student_address_id=:id"	
//			)
//	int deleteStudentNameById(int id);
}
