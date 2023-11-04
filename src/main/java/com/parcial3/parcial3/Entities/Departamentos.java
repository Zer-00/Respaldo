package com.parcial3.parcial3.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.parcial3.parcial3.Entities.Municipios;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table
public class Departamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdDepartament;

    private String nombreDepartamentos;

   @Autowired
    @JsonManagedReference
    @OneToMany(mappedBy = "departament", cascade = {CascadeType.ALL},orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Municipios> municipalities;

    

    public Departamentos() {

    };

    
}
