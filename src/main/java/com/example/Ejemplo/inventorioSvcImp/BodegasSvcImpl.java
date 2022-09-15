/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.inventorioSvcImp;

import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.Ejemplo.interfaz.BodegasSvc;
import com.example.Ejemplo.interfaz.BodegasSvc;
import com.example.Ejemplo.inventarioDao.BodegasDao;
import com.example.Ejemplo.inventarioDao.BodegasDao;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class BodegasSvcImpl implements BodegasSvc {
    
    @Autowired
    private BodegasDao salarepository;

    @Override
    public ArrayList<estados> listar() {
        return (ArrayList<estados>) salarepository.findAll();
    }

    @Override
    public estados addsala(estados salas) {
        return salarepository.save(salas);
    }

    @Override
    public Optional<estados> findpuesto(Long id) {
        
        //List<puestos> p = salarepository.findbynombre("seguridad");
        //System.out.println(p);
        
        return salarepository.findById(id);
    }

   

    
    
}
