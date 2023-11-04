package com.parcial3.parcial3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parcial3.parcial3.Entities.Salario;

@Repository
public interface SalarioRepository extends JpaRepository<Salario, Integer>{
    
}
