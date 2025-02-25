package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" TALLER ALCANCIA");

// Definicion de variables
        int denominacion1 = 20;
        int denominacion2 = 50;
        int denominacion3 = 100;
        int denominacion4 = 200;
        int denominacion5 = 500;
        int opcion;
        int opcionmoneda;

// Inicializar contadores de las variables
        int cdenominacion1 = 0;
        int cdenominacion2 = 0;
        int cdenominacion3 = 0;
        int cdenominacion4 = 0;
        int cdenominacion5 = 0;
        int totalAhorrado = 0;


        Scanner teclado = new Scanner(System.in);

        do {
            // Mostrar  opciones del menu principal

            System.out.println(" Opciones del menu Alcancia");
            System.out.println("1.Quieres ingresar una moneda ");
            System.out.println("2.Contar cuantas monedas tiene de cada denominación ");
            System.out.println("3.Calcular cuanto dinero tiene ahorrado");
            System.out.println("4.Romper alcancia y vaciar su contenido");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();

            // sWitch ingresar a la opcion seleccionada del menu principal
            switch (opcion) {
                case 1:
                    // menu para seleccionar la demoninacion de la moneda

                    System.out.println("Escoge la denominacion de la moneda para agregarla");
                    System.out.println("1. moneda de 20");
                    System.out.println("2. moneda de 50");
                    System.out.println("3. moneda de 100");
                    System.out.println("4. moneda de 200");
                    System.out.println("5. moneda de 500");
                    opcionmoneda = teclado.nextInt();

                    // swinch agraga la moneda a la denominacion segun la opcion eligida

                    switch (opcionmoneda) {
                        case 1:
                            System.out.println("ingresaste una moneda de : " + denominacion1);
                            cdenominacion1++;
                            break;
                        case 2:
                            System.out.println("ingresaste una moneda de  : " + denominacion2);
                            cdenominacion2++;
                            break;
                        case 3:
                            System.out.println("ingresaste una moneda de  : " + denominacion3);
                            cdenominacion4++;
                            break;
                        case 4:
                            System.out.println("ingresaste una moneda de  : " + denominacion4);
                            cdenominacion4++;
                            break;
                        case 5:
                            System.out.println("ingresaste una moneda de  : " + denominacion5);
                            cdenominacion5++;
                            break;
                        default:
                            System.out.println("Esta denominacion de moneda no existe ");
                    }
                    break;
                case 2:
                    // Contar cuántas monedas de cada denominación tiene

                    System.out.println("contar monedas");
                    System.out.println("moneda de 20 hay:" + cdenominacion1);
                    System.out.println("moneda de 50 hay:" + cdenominacion2);
                    System.out.println("moneda de 100 hay:" + cdenominacion3);
                    System.out.println("moneda de 200 hay:" + cdenominacion4);
                    System.out.println("moneda de 500 hay:" + cdenominacion5);
                    break;

                case 3:
                    //Calcular cuanto dinero tiene ahorrado

                    System.out.println("contar total monedas");

                    totalAhorrado = (cdenominacion1 * 20) +
                            (cdenominacion2 * 50) +
                            (cdenominacion3 * 100) +
                            (cdenominacion4 * 200) +
                            (cdenominacion5 * 500);

                    System.out.println("total ahorrado es: "+ totalAhorrado);


                    break;

                case 4:
                    //Romper alcacia y vaciar su contenido

                    System.out.println("Romper alcalcia");
                    System.out.println("Total Dinero:" + totalAhorrado );
                    cdenominacion1 = 0;
                    cdenominacion2 = 0;
                    cdenominacion3 = 0;
                    cdenominacion4 = 0;
                    cdenominacion5 = 0;

                    System.out.println("La alcancía se rompio. Las cantidades de monedas han sido restablecidas a cero.");

                    break;
                default:
                    System.out.println("Esta opcion no existe ");
            }
        } while (opcion != 5);


    }
}