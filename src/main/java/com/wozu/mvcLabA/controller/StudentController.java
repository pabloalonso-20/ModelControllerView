package com.wozu.mvcLabA.controller;

import com.wozu.mvcLabA.model.Student;
import com.wozu.mvcLabA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/postvalues")
    public void postValues(){
        studentService.saveStudent("Pablo", "Alonso","Computer Science");
        studentService.saveStudent("Naomi","Bird","Media Arts");
        studentService.saveStudent("Adelaide","Etxebarri","International Business");

    }

    @GetMapping("/getall")
    public List<Student> getValues(){
        return studentService.getAllStudent();
    }


}
