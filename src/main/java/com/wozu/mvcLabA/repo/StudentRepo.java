package com.wozu.mvcLabA.repo;

import com.wozu.mvcLabA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
