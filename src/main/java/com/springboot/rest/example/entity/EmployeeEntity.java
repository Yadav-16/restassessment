package com.springboot.rest.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

import java.sql.Date;

@Entity
@Table (name= "employeeInfo")
public class EmployeeEntity {
    @Id
   private int employeeId;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private Date dateOfBirth;

    @NonNull
    private int ssn;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int employeeId, @NonNull String firstName, @NonNull String lastName, @NonNull Date dateOfBirth, int ssn) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    @NonNull
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NonNull Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", ssn=" + ssn +
                '}';
    }
}
