package com.parcial3.parcial3.Controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial3.parcial3.Entities.Salario;
import com.parcial3.parcial3.Repositories.SalarioRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/salario")
@RequiredArgsConstructor
public class SalarioController {
    
    @Autowired
    private SalarioRepository repo;

    @GetMapping("/get")
    public List<Salario> getSalario() {

        return  repo.findAll();
    }

    @PostMapping("/create")
    public Salario createSalario (@RequestBody Salario salario) {


        double salarioBruto = salario.getSalario();

        double issLaboral = salarioBruto * 0.03;
        double afpLaboral = salarioBruto * 0.0725;
        double descuento = issLaboral + afpLaboral;


        double salarioLiquido = salarioBruto - descuento;

        salario.setSalario(salarioLiquido);

        return repo.save(salario);
    }
}
