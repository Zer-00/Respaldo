package com.parcial3.parcial3.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parcial3.parcial3.Entities.Departamentos;

@Repository
public interface DepartamentosRepository extends CrudRepository<Departamentos, Integer>{
    
}
