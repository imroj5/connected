package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStud(Student studentreq){
return studentRepository.Save(studentreq);
    }
    public Student getStud(Long id){
        return studentRepository.findById(id);
    }
    public List<Student> getAllStud(){
        return studentRepository.findAll();
    }

}
