package com.bezkoder.spring.thymeleaf.entity;

import javax.persistence.*;

@Entity
@Table(name= "clientes")
public class Clientes {


    @Id
    private int Id;
    private String nombre;
    private float facturacion;

public Clientes(){

}

    public Clientes(int id, String nombre, float facturacion) {
        Id = id;
        this.nombre = nombre;
        this.facturacion = facturacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public float getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(float facturacion) {
        this.facturacion = facturacion;
    }

}
