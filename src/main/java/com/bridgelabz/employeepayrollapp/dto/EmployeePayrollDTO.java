package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class EmployeePayrollDTO {
    public String name;
    public long salary;

}
