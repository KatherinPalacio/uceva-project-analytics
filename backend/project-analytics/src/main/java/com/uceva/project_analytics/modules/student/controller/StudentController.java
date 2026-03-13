package com.uceva.project_analytics.modules.student.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<Map<String,String>> getStudents(){

        List<Map<String,String>> students = new ArrayList<>();

        Map<String,String> s1 = new HashMap<>();
        s1.put("name","Laura Rodríguez");
        s1.put("program","Contaduría Pública");
        s1.put("semester","8");

        Map<String,String> s2 = new HashMap<>();
        s2.put("name","Carlos Martínez");
        s2.put("program","Contaduría Pública");
        s2.put("semester","8");

        students.add(s1);
        students.add(s2);

        return students;
    }
}