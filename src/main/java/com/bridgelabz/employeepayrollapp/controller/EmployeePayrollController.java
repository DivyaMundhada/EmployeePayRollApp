package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", " ", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping(value = "create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted id:"+empId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
