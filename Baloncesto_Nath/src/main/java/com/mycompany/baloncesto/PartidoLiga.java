/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

/**
 *
 * @author user
 */
public class PartidoLiga extends Partido {
    
    private int jornada;
    
    // PARAMETERIZED CONSTRUCTOR
    public PartidoLiga (String equipoLocal, String equipoVisitante, int jornada, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.jornada = jornada;
    }

    // SET
    public void setJornada(int jornada) {
        this.jornada = jornada;
    }
    
    // GET
    public int getJornada() {
        return jornada;
    }
    
    // INTERFACES
    @Override
    public String obtenerGanador() {
       if (super.getCestasLocal() > super.getCestasVisitante() && super.isFinalizado()){
            return super.getEquipoLocal();
        }else if(super.getCestasLocal() < super.getCestasVisitante() 
                && super.isFinalizado()){
            return super.getEquipoVisitante();
        }else if (super.getEquipoLocal() == super.getEquipoVisitante()){
          return "Empate";
        } else{
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
    
    // ABSTRACT METHOD
    @Override
    public String mostrarPartido() {
        return "Partido{" + 
                "equipoLocal=" + super.getEquipoLocal() + 
                ", equipoVisitante=" + super.getEquipoVisitante() + 
                ", cestasLocal=" + super.getCestasLocal() + 
                ", cestasVisitante=" + super.getCestasVisitante() + 
                ", finalizado=" + super.isFinalizado() + 
                ", jornada a jugar=" + this.jornada + 
                ", fechaPartido=" + super.getFechaPartido() + '}'; 
    }

}
