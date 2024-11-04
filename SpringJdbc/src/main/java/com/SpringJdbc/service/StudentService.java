package com.SpringJdbc.service;
import com.SpringJdbc.model.Student;
import com.SpringJdbc.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {



    private StudentRepository sturep;

    public StudentRepository getSturep() {
        return sturep;
    }

    @Autowired
    public void setSturep(StudentRepository sturep) {
        this.sturep = sturep;
    }



    public void addStudent(Student stu) {
        sturep.save(stu);
    }
        public List<Student> getStudent()
        {
            return sturep.findAll();
        }

    }

