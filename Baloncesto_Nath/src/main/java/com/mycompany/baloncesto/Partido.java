/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

/**
 *
 * @author user
 */
public abstract class Partido implements Operaciones{
    
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasLocal;
    private int cestasVisitante;
    private boolean finalizado;
    private String fechaPartido;
     
    
    // PARAMETERIZED CONSTRUCTOR
     public Partido(String equipoLocal, String equipoVisitante,String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.finalizado = false;
        this.fechaPartido = fechaPartido;
    }
    
     
    // SET
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    } 
    
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    
    public void setCestasLocal(int cestasLocal) {
        this.cestasLocal = cestasLocal;
    }
    
    public void setCestasVisitante(int cestasVisitante) {
        this.cestasVisitante = cestasVisitante;
    }
    
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    
    
    // GET
    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getCestasLocal() {
        return cestasLocal;
    }

    public int getCestasVisitante() {
        return cestasVisitante;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    // ABSTRACT METHOD
    public abstract String mostrarPartido();
    
    public void obtenerResultado(){
        System.out.println("Pendiente");
    }
    
}


