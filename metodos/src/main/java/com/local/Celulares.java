package com.local;

public class Celulares {
    
    String nombreCorto ;
    String referencia ;
    String origen ;
    String gama ;
    String serial  ;
    String imei ;
    float pesoGramos ;
    
    
    public Celulares (
        String nombreCorto,
        String referencia,
        String origen,
        String gama,
        String serial,
        String imei,
        float pesoGramos
        
        ){

        this.nombreCorto = nombreCorto;
        this.referencia = referencia;
        this.origen = origen;
        this.gama = gama;
        this.serial = serial;
        this.imei = imei;
        this.pesoGramos = pesoGramos;
        
    }
} 
