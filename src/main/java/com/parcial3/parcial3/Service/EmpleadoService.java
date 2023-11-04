package com.parcial3.parcial3.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parcial3.parcial3.Entities.Empleado;
import com.parcial3.parcial3.Repositories.EmpleadoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpleadoService {

    private EmpleadoRepository repo;

    public Empleado createEmpleado (Empleado empleado) {

        return repo.save(empleado);
    }

    public List<Empleado> getEmpleado() {

        return (List<Empleado>) repo.findAll();
    }

    public void deleteEmpleado(Integer id) {

        repo.deleteById(id);
    }
    
}
