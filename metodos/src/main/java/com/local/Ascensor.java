package com.local;

public class Ascensor {
    
    String nombre;
    int cPersonas; // cantidad personas
    String referencia;    
    String tipo; // industrial , comercial
    Double precio;
    Double precioInstalacion;

    public Ascensor (
        String nombre,
        int cPersonas, 
        String referencia,
        String tipo,
        Double precio,
        Double precioInstalacion
    ){
        this.nombre  = nombre;
        this.cPersonas = cPersonas;
        this.referencia = referencia;
        this.tipo = tipo;
        this.precio =  precio;
        this.precioInstalacion = precioInstalacion;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public void setcPersonasPrecio (int cPersonas, Double precio){
        this.cPersonas = cPersonas;
        this.precio = precio;
    }

    // Obtener valor completo del ascensor , precio + precio de instalación
    public Double getValorTotal (){
        return (this.precio + this.precioInstalacion) ;
    }

}
