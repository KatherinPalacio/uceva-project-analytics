package com.uceva.project_analytics.modules.dashboard.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping("/metrics")
    public Map<String,Integer> getMetrics(){

        Map<String,Integer> metrics = new HashMap<>();

        metrics.put("companies",2);
        metrics.put("projects",2);
        metrics.put("students",2);

        return metrics;
    }

    @GetMapping("/projects-by-sector")
    public List<Map<String,Object>> getProjectsBySector(){

    List<Map<String,Object>> data = new ArrayList<>();

    Map<String,Object> s1 = new HashMap<>();
    s1.put("sector","Agroindustrial");
    s1.put("projects",3);

    Map<String,Object> s2 = new HashMap<>();
    s2.put("sector","Textil");
    s2.put("projects",2);

    Map<String,Object> s3 = new HashMap<>();
    s3.put("sector","Comercio");
    s3.put("projects",4);

    data.add(s1);
    data.add(s2);
    data.add(s3);

    return data;
    }

    @GetMapping("/students-by-project")
    public List<Map<String,Object>> getStudentsByProject(){

    List<Map<String,Object>> data = new ArrayList<>();

    Map<String,Object> p1 = new HashMap<>();
    p1.put("project","Analisis financiero AgroGuadañas");
    p1.put("students",4);

    Map<String,Object> p2 = new HashMap<>();
    p2.put("project","Diagnóstico contable Uniformes Santana");
    p2.put("students",3);

    data.add(p1);
    data.add(p2);

    return data;
    }
}