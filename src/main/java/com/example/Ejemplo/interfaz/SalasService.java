/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.interfaz;

import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres Solorzano
 */

public interface SalasService {
    
    ArrayList<puestos>listar();
    puestos addsala(puestos s);
    Optional<puestos> findpuesto(Long id);
    
}
