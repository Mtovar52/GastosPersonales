package com.example.expenseManagement.services;

import com.example.expenseManagement.entities.GastosBasicos;
import com.example.expenseManagement.interfaceRepo.IRepositoryEmployee;
import com.example.expenseManagement.interfaceRepo.IrepositoryGastosBasicos;
import org.springframework.stereotype.Service;

@Service
public class ServiceGastosBasicos {

    private IrepositoryGastosBasicos iRepositoryGB;

    public ServiceGastosBasicos(IrepositoryGastosBasicos iRepositoryGB) {
        this.iRepositoryGB = iRepositoryGB;
    }

    public GastosBasicos CreateGastosBasicos(GastosBasicos GB){
        return GB;
    }
}
