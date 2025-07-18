package com.zidio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zidio.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    
    // Get all applications by studentId
    List<Application> findByStudentId(Long studentId);

    // Get all applications by jobId
    List<Application> findByJobId(Long jobId);
}

