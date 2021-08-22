package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee Name cannot be Null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Invalid")
    public String name;

    @Min(value = 500, message = "Min Wage should be more than 500")
    public long salary;

    @Pattern(regexp = "male|female",message = "Gender needs to be male or female")
    public String gender;

//    //@JsonFormat(pattern = "dd MM yyyy")
//    @NotNull(message = "Start Date should not be Empty.")
//    //@PastOrPresent(message = "Start Date should be Past or Today's Date")
//    public LocalDate createdDate;

    @NotBlank(message = "Note cannot be Empty")
    public String note;

    @NotBlank(message = "profilePic cannot be Empty")
    public String profilePic;

    @NotNull(message = "Department should not be Empty")
    public List<String> department;
}
