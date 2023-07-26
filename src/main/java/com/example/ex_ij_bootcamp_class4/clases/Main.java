package com.example.ex_ij_bootcamp_class4.clases;

import java.security.KeyManagementException;
import java.util.Scanner;


   /* variable sobrecargada
   public static void maine(Double args) {}
    */
    /*public static void maine(Integer args) {}
    public static void maine(String args) {}

    public static void main(String[] args) {
      /* Ejemplo de crear variable asignarle valor
      String nombre = "Kenia";
        Integer nroEquipo = 1;
        String texto = "Hola soy " + nombre + " del equipo nro. " + nroEquipo;
        System.out.println(texto);*/

      /*  System.out.println("Que edad tienes");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();
        if (edad >= 18)
        {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

       this.maine();

    }*/


    public class Main {

    public static void main(String[] args) {

        /**
         * ejercicio 1
         */
        /*/Scanner cargaDeDatos = new Scanner(System.in);

        //PESO EN KG/ALTURA EN METROS AL CUADRADO

        System.out.println("Ingrese su peso en KG");
        double peso = cargaDeDatos.nextDouble();
        System.out.println("Ingrese su altura en Metros");
        double altura = cargaDeDatos.nextDouble();
        double indiceMasaCorporal = peso / (altura * altura);
        if (indiceMasaCorporal > 30)
        {
            System.out.println("Su IMC clasifica como Obesidad");
        }
        if (indiceMasaCorporal > 25 && indiceMasaCorporal <= 30)
        {
            System.out.println("Su IMC clasifica como Sobrepeso");
        }
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal <= 25)
        {
            System.out.println("Su IMC clasifica como Normal");
        }
        if (indiceMasaCorporal < 18.5)
        {
            System.out.println("Su IMC clasifica como Debajo de lo Normal");
        }
   }

    // Mayor de 30 obesidad;
       //Sobrepeso entre 25-30;
       //Normal entre 18.5-25;
       //Debajo Normal Menor de 18.5;

 }*/
        /**
         * ejercicio Calc edad de perro
         */
        /*Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro");
        Integer edadPerro= cargaDeDatos.nextInt()*7;
        System.out.println("La edad de su perro es :" + edadPerro);  */

        /**
         * ejercicio Conversor de millas a kilómetros:
         * Pídele al usuario que ingrese una distancia en millas.
         * Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
         * Muestra la distancia en kilómetros al usuario.
         */
       /* Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas.");
        double kilometros=cargaDeDatos.nextDouble()*1.60934;
        System.out.println("La distancias es:" + kilometros + "KM");*/

        /**
         3) Calculadora de descuento:
         Pídele al usuario que ingrese el precio original de un producto.
         Pídele al usuario que ingrese el porcentaje de descuento.
         Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
         Muestra el precio final al usuario.
         */
      /*  Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese el precio original de un producto.");
        double precioOriginal= cargaDeDatos.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento.");
        double descuento= cargaDeDatos.nextFloat();
        double precioFinal = precioOriginal-(precioOriginal*descuento/100);
        System.out.println("El precioFinal es:" + precioFinal);*/
        /**
         4) Calculadora de propinas:
         Pídele al usuario que ingrese el total de la cuenta en un restaurante.
         Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
         Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
         */
       /* Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta en un restaurante.");
        double totalCuenta= cargaDeDatos.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar.");
        double porcentajePropina=cargaDeDatos.nextFloat();
        double propina= totalCuenta * (porcentajePropina /100);
        System.out.println("El monto de propina a dejar es:" + propina);*/

        /** 5) Juego de adivinar el número:
         Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
         */

        /*Scanner cargaDeDatos = new Scanner(System.in);
        int numeroUsuario=0;
        int numeroAleatorio= (int) Math.floor(Math.random()*100);
        System.out.println("Ingrese un numero aleatorio.");
        numeroUsuario = cargaDeDatos.nextInt();
        if(numeroUsuario==numeroAleatorio)
        {
            System.out.println("Adivinaste el numero");
        }
       else
       {
           System.out.println("Numero equivocado");
        }
       */

        /**Clase 6 Carga 3 numeros y determina cual es el mayor y cual es el menor.
         */

        Scanner cargaDeDatos = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        System.out.println("Ingrese el numero1");
        numero1 = cargaDeDatos.nextInt();
        System.out.println("Ingrese el numero2");
        numero2 = cargaDeDatos.nextInt();
        System.out.println("Ingrese el numero3");
        numero3 = cargaDeDatos.nextInt();
        if (numero1 > numero2 && numero1 > numero3)
        {
            System.out.println("El numero1 es el mayor");
        }
        else {
            if (numero2 > numero3 && numero2 > numero1) {
                System.out.println("El numero2 es el mayor");
            } else {
                if (numero3 > numero1 && numero3 > numero2) {
                    System.out.println("El numero3 es el mayor");
                }
            }
            if (numero1 < numero2 && numero1 < numero3) {
                System.out.println("El numero1 es el menor");
            } else
            {
            if (numero2 < numero3 && numero2 < numero1)
                {
                    System.out.println("El numero2 es el menor");
                } else if (numero3 < numero1 && numero3 < numero2)
                {
                    System.out.println("El numero3 es el menor");
            }
            }
        }

        }


    }















