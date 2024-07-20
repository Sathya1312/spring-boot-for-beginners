package com.love2code.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(new Student(
                        "Sathya",
                        "Priya",
                        LocalDate.now(),
                        "contact@sathyacoding.com",
                        34
                ),
                new Student(
                        "Anand",
                        "Shankar",
                        LocalDate.now(),
                        "anandhero@gmail.com",
                        34
                ));
    }
}
