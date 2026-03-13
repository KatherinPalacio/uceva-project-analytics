package com.uceva.project_analytics.modules.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uceva.project_analytics.modules.company.model.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

}