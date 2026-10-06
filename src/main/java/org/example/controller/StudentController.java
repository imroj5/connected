package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
// Cretaing the table
    @PostMapping("/create")
    public ResponseEntity<Student> CreatingStudent(@RequestBody Student studentreq){
        Student createdStudent=studentService.createStud(studentreq);
        return ResponseEntity.ok(createdStudent);
    }

    //the read the data
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
       Student gotStudent= studentService.getStud(id);

       if(gotStudent==null){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(gotStudent);
    }

    //to Read all the data

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> gotStudent= studentService.getAllStud();

        if(gotStudent==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(gotStudent);
    }


}
