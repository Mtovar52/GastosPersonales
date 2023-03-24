package com.example.expenseManagement.interfaceRepo;

import com.example.expenseManagement.entities.Employee;
import com.example.expenseManagement.entities.GastosNoEsenciales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepositoryGastosNoEsenciales extends JpaRepository<GastosNoEsenciales, Long> {
}
