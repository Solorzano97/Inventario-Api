/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ejemplo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Andres Solorzano
 */
@Entity
@Table(name="estados")
public class puestos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estados_id")
    private Long idEstados;
    
    @Column(name = "Descripcion")
    private String descripcion;

    public puestos() {
    }

    public Long getIdEstados() {
        return idEstados;
    }

    public void setIdEstados(Long idEstados) {
        this.idEstados = idEstados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "puestos{" + "idEstados=" + idEstados + ", descripcion=" + descripcion + '}';
    }

    
    
    

  
    
    
    
    
}
