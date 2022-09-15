/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.inventarioDao;

import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
import com.example.Ejemplo.Model.estados;
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
public interface BodegasDao extends JpaRepository<estados , Long> {
    
   
    
    @Query(
            value = "select * from inventory.estados e where descripcion_estado  = :nombre",
            nativeQuery=true
    )
     List<estados> findbynombre(@Param("nombre") String nombre);
}
