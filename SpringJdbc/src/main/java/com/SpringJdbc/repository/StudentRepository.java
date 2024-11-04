package com.SpringJdbc.repository;

import com.SpringJdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepository {


    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Student stu)
    {
        String str="Insert into Student (rollno,name,marks) values(?,?,?)";

        int i=jdbc.update(str, stu.getRollno(),stu.getName(), stu.getMarks());

        System.out.println(i+"rows effected");
    }

    public List<Student> findAll()
    {
        String s="Select * from Student";
        RowMapper<Student> rowmapper= new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        return jdbc.query(s,rowmapper);

    }

}
