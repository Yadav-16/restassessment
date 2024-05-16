package com.springboot.rest.example.repository;

import com.springboot.rest.example.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Integer > {

}
