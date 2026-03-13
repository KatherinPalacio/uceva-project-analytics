package com.uceva.project_analytics.modules.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uceva.project_analytics.modules.project.model.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}