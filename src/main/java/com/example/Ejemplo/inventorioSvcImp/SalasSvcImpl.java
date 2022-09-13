/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.inventorioSvcImp;

import com.example.Ejemplo.inventarioDao.SalaRepository;
import com.example.Ejemplo.inventarioDao.SalaRepository;
import com.example.Ejemplo.interfaz.SalasService;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.interfaz.SalasService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class SalasSvcImpl implements SalasService {
    
    @Autowired
    private SalaRepository salarepository;

    @Override
    public ArrayList<puestos> listar() {
        return (ArrayList<puestos>) salarepository.findAll();
    }

    @Override
    public puestos addsala(puestos salas) {
        return salarepository.save(salas);
    }

    @Override
    public Optional<puestos> findpuesto(Long id) {
        
        List<puestos> p = salarepository.findbynombre("seguridad");
        System.out.println(p);
        
        return salarepository.findById(id);
    }

   

    
    
}
