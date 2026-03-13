package com.uceva.project_analytics.modules.project.model;

import jakarta.persistence.*;
import com.uceva.project_analytics.modules.company.model.CompanyEntity;

@Entity
@Table(name = "projects")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private SectorEntity sector;

    public ProjectEntity() {}

}