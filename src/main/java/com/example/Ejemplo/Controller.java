/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo;

import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.interfaz.SalasService;
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


@RestController
@RequestMapping("/salitas")
public class Controller {
    @Autowired
    private SalasService salasservice;
    
    @GetMapping(value = "/all" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<puestos> hola(){
        return salasservice.listar();
    }
    
    @PostMapping(value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public puestos guardarUsuario(@RequestBody puestos salas){
        return this.salasservice.addsala(salas);
    }
    
    @GetMapping(value = "/findbydbid/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional <puestos> findpuesto (@PathVariable("id") Long id){
        Optional<puestos> p = salasservice.findpuesto(id);
        return p;
    }
    
    /*@Autowired
    private SalasService salasservice;
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
