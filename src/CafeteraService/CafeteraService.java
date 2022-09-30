/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraService;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CafeteraService {

    Scanner leer = new Scanner(System.in);
    // Cafetera cafe = new Cafetera();

    public void llenarCafetera(Cafetera X) {
        System.out.println("\n SE LLENA LA CAFETERA");
        X.setCantidadActual(X.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera X) {
        System.out.println("\n SERVIR TAZA");
        int tamano;
        System.out.println("Elija el tamaño de la taza");
        do {
            System.out.println("1.Taza chica(4 cm3)\n2. Taza mediana(6 cm3)\n3.Taza grande(8 cm3)");
            tamano = leer.nextInt();

            switch (tamano) {
                case 1: {
                    if (X.getCantidadActual() < 4) {
                        System.out.println("Cafetera sin cafe suficiente, se sirve de cortesia:" + X.getCantidadActual());
                        X.setCantidadActual(0);
                    } else {
                        X.setCantidadActual(X.getCantidadActual() - 4);
                    }

                }
                break;
                case 2: {
                    if (X.getCantidadActual() < 6) {
                        System.out.println("Cafetera sin cafe suficiente, se sirve de cortesia:" + X.getCantidadActual());
                        X.setCantidadActual(0);
                    } else {
                        X.setCantidadActual(X.getCantidadActual() - 6);
                    }

                    break;
                }
                case 3: {
                    if (X.getCantidadActual() < 8) {
                        System.out.println("Cafetera sin cafe suficiente, se sirve de cortesia:" + X.getCantidadActual());
                        X.setCantidadActual(0);
                    } else {
                        X.setCantidadActual(X.getCantidadActual() - 8);
                    }

                    break;
                }
                default:
                    System.out.println("Ha ingreado una opcion incorrecta");

            }

        } while (tamano != 1 & tamano != 2 & tamano != 3);
        if (X.getCantidadActual() >= 8) {
            System.out.println("Cafe restante = " + X.getCantidadActual() + " CM3");

        } else {
            System.out.println("Cafe restante = " + X.getCantidadActual() + " CM3.\n Llene la cafetera");
        }

    }

    public void vaciarCafetera(Cafetera X) {
        System.out.println("\n VACIAR CAFETERA");
        X.setCantidadActual(0);

    }

    public void agregarCafe(Cafetera X) {
        System.out.println("\n AGREGAR CAFE");
        System.out.println("La cafetera tiene " + X.getCantidadActual() + " y su capacidad maxima es " + X.getCapacidadMaxima());

        System.out.println("Cuanto cafe va a agregar en cm3");
        X.setCantidadActual(X.getCantidadActual()+ leer.nextInt());
        if (X.getCantidadActual()> X.getCapacidadMaxima()) {
            System.out.println("Se derramo " + (X.getCantidadActual()- X.getCapacidadMaxima()));
           X.setCantidadActual(X.getCapacidadMaxima());
        }
        System.out.println("Cantidad actual es igual a "+ X.getCantidadActual());
    }
    
    
}
