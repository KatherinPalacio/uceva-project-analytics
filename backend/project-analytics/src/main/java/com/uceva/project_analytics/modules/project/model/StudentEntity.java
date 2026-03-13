package com.uceva.project_analytics.modules.project.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String program;

    @ManyToMany(mappedBy = "students")
    private List<ProjectEntity> projects;

}