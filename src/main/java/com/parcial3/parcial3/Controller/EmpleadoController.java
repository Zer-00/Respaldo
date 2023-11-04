package com.parcial3.parcial3.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial3.parcial3.Entities.Empleado;
import com.parcial3.parcial3.Repositories.EmpleadoRepository;
import com.parcial3.parcial3.Service.EmpleadoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/empleado")
@RequiredArgsConstructor

public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private EmpleadoRepository repo;

    @GetMapping("/get")
    public List<Empleado> getEmpleado() {

        return  repo.findAll();
    }

    @PostMapping("/create")
    public Empleado createEmpleado (@RequestBody Empleado empleado) {

        return repo.save(empleado);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteEmpleado (@PathVariable Integer id) {

        repo.deleteById(id);;

        return "El Empleado se ha eliminado Correctamente";
    }
    
}
