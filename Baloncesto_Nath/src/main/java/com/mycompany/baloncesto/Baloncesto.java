/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baloncesto;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Baloncesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        while (true){
            System.out.println("Bienvenid@ a la liga de baloncesto");
            System.out.println("Elige la opción que deseas: ");
            System.out.println("1. Partido Liga");
            System.out.println("2. Partido Play Off");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            
            if (opcion == 1){
                System.out.println("Elige la opción que deseas: ");
                System.out.println("1. Registrar partido");
                System.out.println("2. Finalizar partido");
                System.out.println("3. Mostrar al ganador");
                System.out.println("4. Informacion de partido");
                System.out.println("5. Salir al menu principal");
                int opcion1 = scanner.nextInt();
                
                PartidoLiga primerPartido = null;
                
                switch (opcion1){
                    case 1:
                        System.out.println("Ingrese el nombre del equipo local: ");
                        String local = scanner.nextLine();
                        
                        System.out.println("Ingrese el nombre del equipo visitante: ");
                        String visitante = scanner.nextLine();
                        
                        System.out.println("Ingrese el numero de la jornada a participar: ");
                        int jornade = scanner.nextInt();
                        
                        System.out.println("Ingrese la fecha del partido: ");
                        String fecha1 = scanner.nextLine();
                        
                        primerPartido = new PartidoLiga (local, visitante, jornade, fecha1);
                        primerPartido.setFinalizado(false);
                        break;
                        
                    case 4:
                        System.out.println(primerPartido.mostrarPartido());
                        break;
                }
            } else if (opcion == 2){
                System.out.println("SOY EL DOS EN CONSTRUCCION ");
            } else if (opcion == 3){
                System.out.println("Adios!");
                break;
            } else {
                System.out.println("Esa opción no está, escoja otra");
            }

        }
       
        
    }
}
