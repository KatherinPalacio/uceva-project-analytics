package com.uceva.project_analytics.modules.dashboard.controller;

import com.uceva.project_analytics.modules.dashboard.dto.DashboardMetricsDTO;
import com.uceva.project_analytics.modules.dashboard.service.DashboardService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/metrics")
    public DashboardMetricsDTO getMetrics() {
        return dashboardService.getMetrics();
    }
}