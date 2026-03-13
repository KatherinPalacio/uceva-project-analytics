package com.uceva.project_analytics.modules.dashboard.dto;

public class DashboardMetricsDTO {

    private long totalProjects;
    private long totalStudents;
    private long totalCompanies;

    public DashboardMetricsDTO(long totalProjects, long totalStudents, long totalCompanies) {
        this.totalProjects = totalProjects;
        this.totalStudents = totalStudents;
        this.totalCompanies = totalCompanies;
    }

    public long getTotalProjects() {
        return totalProjects;
    }

    public long getTotalStudents() {
        return totalStudents;
    }

    public long getTotalCompanies() {
        return totalCompanies;
    }
}