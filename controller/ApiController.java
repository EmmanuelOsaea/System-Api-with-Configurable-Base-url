package com.example.controller

import com.example.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  
  private final ApiService apiService;

  public ApiController(ApiService apiService)
       this.apiService = apiService;
}

@GetMapping("/api/base-url")
  public String getBaseUrl() {
  return apiService.getBaseUrl();
  }
  }
  
