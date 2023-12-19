package com.local;

public class PartidoLiga extends Partido {
    
    int jornada;    

    // getters & setters
    public int getJornada() {
        return this.jornada;
    }
    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    // Super
    public PartidoLiga( String equipoLocal,
                        String equipoVisitante,
                        String fechaPartido,
                        int jornada ){
        super(equipoLocal,equipoVisitante,fechaPartido);
        this.jornada = jornada;
    };

    

}
