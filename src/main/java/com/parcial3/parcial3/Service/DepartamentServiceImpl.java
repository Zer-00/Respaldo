package com.parcial3.parcial3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parcial3.parcial3.Entities.Departamentos;
import com.parcial3.parcial3.Repositories.DepartamentosRepository;
import com.parcial3.parcial3.Repositories.IGenericRepo;
import com.parcial3.parcial3.Service.impl.CRUDImpl;

@Service
public class DepartamentServiceImpl extends CRUDImpl<Departamentos, Integer> implements IDepartmentService  {
    @Autowired
    private DepartamentosRepository repo;

    @Override
    protected IGenericRepo <Departamentos, Integer> getRepo(){
        return (IGenericRepo<Departamentos, Integer>) this.repo;
    }
}
