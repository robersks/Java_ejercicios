package com.local;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Ascensor ascensor_1 = new Ascensor(
            "Asensor 15",
            4,
            "HC 54521",
            "Comercial",
            10000000.0,
            200000.0
        );

        System.out.println(ascensor_1.nombre);
        
        System.out.println(ascensor_1.getValorTotal());

        System.out.println();
    }
} 