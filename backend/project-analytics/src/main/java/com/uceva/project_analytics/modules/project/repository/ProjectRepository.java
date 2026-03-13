package com.uceva.project_analytics.modules.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uceva.project_analytics.modules.project.model.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

}