package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", " ", "/"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping(value = "/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Get Call Success for id " + empId, HttpStatus.OK);
    }

    @PostMapping(value = "create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: " + employeePayrollDTO, HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("Updated Employee Payroll Data for: " + employeePayrollDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Deleted Employee Payroll Data for: " + empId, HttpStatus.OK);
    }
}
