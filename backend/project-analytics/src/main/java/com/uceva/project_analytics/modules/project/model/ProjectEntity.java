package com.uceva.project_analytics.modules.project.model;

import jakarta.persistence.*;
import java.util.List;
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

    @ManyToMany
    @JoinTable(
        name = "project_students",
        joinColumns = @JoinColumn(name = "project_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<StudentEntity> students;

}