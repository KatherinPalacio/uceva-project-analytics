package com.uceva.project_analytics.modules.company.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CompanyService {

    public List<Map<String, String>> getCompanies(){

        List<Map<String, String>> companies = new ArrayList<>();

        Map<String, String> c1 = new HashMap<>();
        c1.put("name","AgroGuadañas Sevilla");
        c1.put("sector","Agroindustrial");

        Map<String, String> c2 = new HashMap<>();
        c2.put("name","Uniformes Santana");
        c2.put("sector","Textil");

        companies.add(c1);
        companies.add(c2);

        return companies;
    }
}