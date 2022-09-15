/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.inventarioDao;

import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import com.example.Ejemplo.Model.puestos;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andres Solorzano
 */
@Repository
public interface SalaRepository extends JpaRepository<puestos , Long> {
    
   
    
    @Query(
            value = "select * from inventory.estados e where  Descripcion  = :nombre",
            nativeQuery=true
    )
     List<puestos> findbynombre(@Param("nombre") String nombre);
}
