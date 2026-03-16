package com.hexagon.studentservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/id/{id}")
    public String fetchStudentById(@PathVariable String id){
		return "Student Service Access";
       
    }
   

}
