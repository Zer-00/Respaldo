package com.parcial3.parcial3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial3.parcial3.Entities.Inactivos;
import com.parcial3.parcial3.Repositories.InactivosRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/inactivos")
@RequiredArgsConstructor
public class InactivosController {
    
    @Autowired
    private InactivosRepository repo;

    @GetMapping("/get")
    public List<Inactivos> getInactivos() {

        return  repo.findAll();
    }

    @PostMapping("/create")
    public Inactivos createInactivos (@RequestBody Inactivos inactivos) {

        if (inactivos.getMotivo() != null) {

            inactivos.setEstado("Inactivo");
            
        } else {

            inactivos.setEstado("Activo");
        }


        System.out.println(inactivos);

        return repo.save(inactivos);
    }
}
