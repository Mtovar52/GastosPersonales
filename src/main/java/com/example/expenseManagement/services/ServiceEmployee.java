package com.example.expenseManagement.services;

import com.example.expenseManagement.entities.Employee;
import com.example.expenseManagement.interfaceRepo.IRepositoryEmployee;
import com.example.expenseManagement.response.ResponseEmployee;
import com.example.expenseManagement.response.ResponseEmployeeAll;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceEmployee {
    private IRepositoryEmployee iRepository;
    private ResponseEmployee response;

    private  ResponseEmployeeAll responseAll;

    public ServiceEmployee(IRepositoryEmployee iRepository){
        this.iRepository = iRepository;

    }

   public ResponseEmployee CreateEmployee(Employee newEmployee){
       Employee data = iRepository.save(newEmployee);
       if (data != null){
           this.response = new ResponseEmployee(
                   "Create",
                   "Los datos se han guardado exitosamente",
                   200,
                   data
           );
       }
        return response;
   }

    public ResponseEmployeeAll ListAll(){
       List<Employee> data = iRepository.findAll();
        if (data != null){
            this.responseAll = new ResponseEmployeeAll(
                    "Create",
                    "Los datos se han guardado exitosamente",
                    200,
                    data
            );
        }
        return responseAll;
    }

}
