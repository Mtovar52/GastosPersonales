package com.example.expenseManagement.controller;

import com.example.expenseManagement.entities.Employee;
import com.example.expenseManagement.entities.GastosBasicos;
import com.example.expenseManagement.response.ResponseEmployee;
import com.example.expenseManagement.services.ServiceGastosBasicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerGastosBasicos {
    private ServiceGastosBasicos serviceGastosBasicos;

    public ControllerGastosBasicos(ServiceGastosBasicos serviceGastosBasicos) {
        this.serviceGastosBasicos = serviceGastosBasicos;
    }

    @PostMapping("/gastosbasicos")
    public GastosBasicos CreateEmployee(@RequestBody GastosBasicos gBasicos){
        return serviceGastosBasicos.CreateGastosBasicos(gBasicos);
    }
}
