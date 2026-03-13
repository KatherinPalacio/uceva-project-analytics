package com.uceva.project_analytics.modules.project;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @GetMapping
    public List<Map<String,String>> getProjects(){

        List<Map<String,String>> projects = new ArrayList<>();

        Map<String,String> p1 = new HashMap<>();
        p1.put("title","Analisis financiero AgroGuadañas");
        p1.put("semester","8");
        p1.put("program","Contaduría Pública");

        Map<String,String> p2 = new HashMap<>();
        p2.put("title","Diagnóstico contable Uniformes Santana");
        p2.put("semester","8");
        p2.put("program","Contaduría Pública");

        projects.add(p1);
        projects.add(p2);

        return projects;
    }
}