package com.springboot.rest.example.service;

import com.springboot.rest.example.entity.EmployeeEntity;
import com.springboot.rest.example.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


   private final EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(int id) throws EntityNotFoundException {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Invalid Id"));

    }

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);

    }

    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) throws EntityNotFoundException {

        EmployeeEntity theEmployee = employeeRepository.findById(employeeEntity.getEmployeeId())
                .orElseThrow(() -> new EntityNotFoundException("Invalid Id"));

        theEmployee.setFirstName(employeeEntity.getFirstName());
        theEmployee.setLastName(employeeEntity.getLastName());
        theEmployee.setDateOfBirth(employeeEntity.getDateOfBirth());
        theEmployee.setSsn(employeeEntity.getSsn());
        return employeeRepository.save(theEmployee);

    }

    public void deleteEmployee(int id) throws EntityNotFoundException {
        EmployeeEntity theEmployee = employeeRepository.findById( id)
                .orElseThrow(() -> new EntityNotFoundException("Invalid Id"));
        employeeRepository.deleteById(id);

    }

}
