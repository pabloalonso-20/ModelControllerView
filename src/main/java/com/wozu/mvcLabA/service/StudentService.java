package com.wozu.mvcLabA.service;

import com.wozu.mvcLabA.model.Student;
import com.wozu.mvcLabA.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void saveStudent(String firstName, String lastName, String major){
        studentRepo.save(new Student(firstName,lastName,major));
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

}
