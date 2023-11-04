package com.parcial3.parcial3.Controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial3.parcial3.Entities.Departamentos;
import com.parcial3.parcial3.Entities.Municipios;
import com.parcial3.parcial3.Repositories.DepartamentosRepository;
import com.parcial3.parcial3.Repositories.MunicipiosRepository;
import com.parcial3.parcial3.Service.DepartamentServiceImpl;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/dep")
@RequiredArgsConstructor
public class DepartamentosController {
    @Autowired
    private DepartamentosRepository repo;

    @Autowired
    private DepartamentServiceImpl departamentServiceImpl;

    @Autowired
    private MunicipiosRepository municipiosRepository;

    // @Autowired(required = true)
    // private ModelMapper mapper;

    @GetMapping("/obtener")
    public List<Departamentos> getDepartamentos(){
        return (List<Departamentos>) repo.findAll();
    }

    @PostMapping("/guardar")
    public Departamentos createDepartamentos(@RequestBody Departamentos departamentos){
        return repo.save(departamentos);
    }

    @PostMapping("/addmuni")
    public Municipios addMunicipios(@RequestBody Municipios municipios){
        return municipiosRepository.save(municipios);
    }
    
    //  @GetMapping("/{id}")
    // public ResponseEntity<Departamentos> findById(@PathVariable("id") Integer id) {

    //     Departamentos dtoResponse;
    //     Departamentos obj = departamentServiceImpl.findById(id);
    //     if (obj == null) {
    //         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    //     } else {
    //         dtoResponse = mapper.map(obj, Departamentos.class);
    //     }
    //     return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
    // }

    
}
