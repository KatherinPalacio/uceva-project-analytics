package com.uceva.project_analytics.modules.dashboard.service;

import com.uceva.project_analytics.modules.dashboard.dto.DashboardMetricsDTO;
import com.uceva.project_analytics.modules.company.repository.CompanyRepository;
import com.uceva.project_analytics.modules.project.repository.ProjectRepository;
import com.uceva.project_analytics.modules.project.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final ProjectRepository projectRepository;
    private final StudentRepository studentRepository;
    private final CompanyRepository companyRepository;

    public DashboardService(
            ProjectRepository projectRepository,
            StudentRepository studentRepository,
            CompanyRepository companyRepository) {

        this.projectRepository = projectRepository;
        this.studentRepository = studentRepository;
        this.companyRepository = companyRepository;
    }

    public DashboardMetricsDTO getMetrics() {

        long totalProjects = projectRepository.count();
        long totalStudents = studentRepository.count();
        long totalCompanies = companyRepository.count();

        return new DashboardMetricsDTO(
                totalProjects,
                totalStudents,
                totalCompanies
        );
    }
}