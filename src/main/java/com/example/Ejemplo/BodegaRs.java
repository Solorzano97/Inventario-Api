/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo;

import com.example.Ejemplo.Model.estados;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Ejemplo.interfaz.BodegasSvc;


@RestController
@RequestMapping("/bodegas")
public class BodegaRs {
    @Autowired
    private BodegasSvc salasservice;
    
    @GetMapping(value = "/all" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<estados> hola(){
        return salasservice.listar();
    }
    
    @PostMapping(value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public estados guardarUsuario(@RequestBody estados salas){
    
        return this.salasservice.addsala(salas);
    }
    
    @GetMapping(value = "/findbydbid/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional <estados> findpuesto (@PathVariable("id") Long id){
        Optional<estados> p = salasservice.findpuesto(id);
        return p;
    }
    
    /*@Autowired
    private BodegasSvc salasservice;
    @GetMapping("/list")
    public List<Salas>listar(){
        return salasservice.listar();
    }
    
    @GetMapping("/list")
    public ModelAndView ListAllsalas(){
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("salas" , salasservice. listar());
        return mav;
    }
   */
    
    
    
}
