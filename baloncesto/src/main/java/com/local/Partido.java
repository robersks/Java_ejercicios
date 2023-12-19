package com.local;

public abstract class  Partido implements Operaciones {
    private String equipolocal;
    private String equipoVisitante;
    private int cestasLocal;
    private int cestasVisitante;
    private boolean finalizado;
    private String fechaPartido;

    // Constructor 
    public Partido(String equipolocal, String equipoVisitante, String fechaPartido) {
        this.equipolocal = equipolocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.finalizado = false;
        this.fechaPartido = fechaPartido;
    }

    // metodo abstracto
    public abstract String mostrarPartido();



    // comentado porque no sé pa que es , luego miramos 

    // public void obtenerResultado(){
    //     System.out.println("Pendiente");
    // }
    


    // GETTERS & SETTERS

    public String getEquipolocal() {
        return this.equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public String getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getCestasLocal() {
        return this.cestasLocal;
    }

    public void setCestasLocal(int cestasLocal) {
        this.cestasLocal = cestasLocal;
    }

    public int getCestasVisitante() {
        return this.cestasVisitante;
    }

    public void setCestasVisitante(int cestasVisitante) {
        this.cestasVisitante = cestasVisitante;
    }

    public boolean isFinalizado() {
        return this.finalizado;
    }

    public boolean getFinalizado() {
        return this.finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getFechaPartido() {
        return this.fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    
}
