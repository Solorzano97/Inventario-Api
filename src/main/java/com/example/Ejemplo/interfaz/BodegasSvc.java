/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.interfaz;

import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andres Solorzano
 */

public interface BodegasSvc {
    
    ArrayList<estados>listar();
    estados addsala(estados s);
    Optional<estados> findpuesto(Long id);
    
}
