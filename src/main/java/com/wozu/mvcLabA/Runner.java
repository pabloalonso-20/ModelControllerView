package com.wozu.mvcLabA;

import com.wozu.mvcLabA.repo.StudentRepo;
import com.wozu.mvcLabA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        studentService.saveStudent("Pablo", "Alonso","Computer Science");
        studentService.saveStudent("Naomi","Bird","Media Arts");
        studentService.saveStudent("Adelaide","Etxebarri","International Business");
        System.out.println("Entities added");
    }



}
