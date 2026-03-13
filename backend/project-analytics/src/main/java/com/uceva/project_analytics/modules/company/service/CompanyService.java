package com.uceva.project_analytics.modules.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uceva.project_analytics.modules.company.model.CompanyEntity;
import com.uceva.project_analytics.modules.company.repository.CompanyRepository;

@Service
public class CompanyService {

    private final CompanyRepository repository;

    public CompanyService(CompanyRepository repository){
        this.repository = repository;
    }

    public List<CompanyEntity> getCompanies(){
        return repository.findAll();
    }

    public CompanyEntity saveCompany(CompanyEntity company){
        return repository.save(company);
    }

}