package com.uceva.project_analytics.modules.company.model;

import jakarta.persistence.*;

@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String sector;

    private String city;

    public CompanyEntity(){}

    public CompanyEntity(Long id, String name, String sector, String city){
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.city = city;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSector(){
        return sector;
    }

    public String getCity(){
        return city;
    }
}