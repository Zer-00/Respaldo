package com.parcial3.parcial3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial3.parcial3.Entities.Departamentos;
import com.parcial3.parcial3.Repositories.DepartamentosRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/zzz")
@RequiredArgsConstructor
public class DepartamentosController {
    @Autowired
    private DepartamentosRepository departamentosRepository;

    @GetMapping("/obtener")
    public List<Departamentos> getDepartamentos(){
        return departamentosRepository.findAll();
    }

}
