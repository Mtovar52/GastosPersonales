package com.example.expenseManagement.controller;


import com.example.expenseManagement.entities.Employee;
import com.example.expenseManagement.response.ResponseEmployee;
import com.example.expenseManagement.services.ServiceEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerEmployee {
    private ServiceEmployee serviceEmployee;

    public ControllerEmployee(ServiceEmployee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
    }

    @PostMapping("/employee")
    public ResponseEmployee CreateEmployee(@RequestBody Employee employee){
        return serviceEmployee.CreateEmployee(employee);
    }
    @GetMapping("/employee")
    public List<Employee> ListAllEmployee(){
        return serviceEmployee.ListAll();
    }
}
