package com.uceva.project_analytics.modules.company.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.uceva.project_analytics.modules.company.model.CompanyEntity;
import com.uceva.project_analytics.modules.company.service.CompanyService;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    @GetMapping
    public List<CompanyEntity> getCompanies() {
        return companyService.getCompanies();
    }
}