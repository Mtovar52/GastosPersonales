package com.example.expenseManagement.interfaceRepo;

import com.example.expenseManagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryEmployee extends JpaRepository<Employee, Long>{
}
