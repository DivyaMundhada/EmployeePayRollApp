package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class EmployeePayrollData {

    private int employeeId;
    private String name;
    private long salary;
    private String gender;
    private String startDate;
    private String note;
    private String profilePic;
    private List<String> departments;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
    this.employeeId=empId;
    this.name=employeePayrollDTO.name;
    this.salary=employeePayrollDTO.salary;
    this.gender=employeePayrollDTO.gender;
    this.startDate=employeePayrollDTO.startDate;
    this.note=employeePayrollDTO.note;
    this.profilePic=employeePayrollDTO.profilePic;
    this.departments=employeePayrollDTO.department;
    }
}
