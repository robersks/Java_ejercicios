/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

/**
 *
 * @author user
 */
public class PartidoPlayOff extends Partido {
    
    private String ronda;
    
    // PARAMETERIZED CONSTRUCTOR
    public PartidoPlayOff(String equipoLocal, String equipoVisitante, String fechaPartido, String ronda) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.ronda = ronda;
    }
    
    // SET
    public void setRonda(String ronda) {
        this.ronda = ronda;
    }
    
    // GET
    public String getRonda() {
        return ronda;
    }
    
    // INTERFACES
    @Override
    public String obtenerGanador() {
         if (super.getCestasLocal() > super.getCestasVisitante() && super.isFinalizado()){
            return super.getEquipoLocal();
        }else if(super.getCestasLocal() < super.getCestasVisitante() && super.isFinalizado()){
            return super.getEquipoVisitante();
        }else{
            return "Partido no finalizado";
        }
    }

    @Override
    public boolean finalizarPartido() {
        if (super.getCestasLocal() == super.getCestasVisitante()) {
            return false;
        }else{
            super.setFinalizado(true);
            return true;
        }
    }
    
    // ABSTRACT METHOD7
    @Override
    public String mostrarPartido() {
         return "Partido{" + 
                "equipoLocal=" + super.getEquipoLocal() + 
                ", equipoVisitante=" + super.getEquipoVisitante() + 
                ", cestasLocal=" + super.getCestasLocal() + 
                ", cestasVisitante=" + super.getCestasVisitante() + 
                ", finalizado=" + super.isFinalizado() + 
                ", ronda=" + this.ronda + 
                ", fechaPartido=" + super.getFechaPartido() + '}';
    }
    
    
    

    

}
