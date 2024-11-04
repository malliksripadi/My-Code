package com.SpringDataJPA.repository;

import com.SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

   // @Query("Select s from Student s where s.name= ?1 ")
    //The above annotation is used when we need to find an object or a row which is not a primary key
    //and the name of method is not same as the name of a property or variable.But below we have a property
    //named "name"(which is a variable name).So,the spring data jpa will automatically find it
    // and implement the inbuilt findBy query.

    List<Student> findByName(String name);

    List<Student> findByMarksGreaterThan(int marks);
}
