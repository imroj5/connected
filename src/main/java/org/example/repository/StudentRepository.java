package org.example.repository;

import org.example.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.chrono.JapaneseEra.values;
@Repository
public class StudentRepository {

    private Map<Long, Student> DBStudent;

    public StudentRepository() {
        this.DBStudent = new HashMap<>();
    }


    public Student Save(Student studentreq){
        DBStudent.put(studentreq.getId(),studentreq);
        return studentreq;
    }

    public Student findById(Long id){
        return DBStudent.get(id);
    }

    public List<Student> findAll(){

        return new ArrayList<>(DBStudent.values());
    }
}
