
package com.mycompany.sentenciasdecontrol;

import java.util.Scanner;

public class SentenciasDeControl {

    public static void main(String[] args) {
        System.out.println("SENTENCIAS DE CONTROL");
        System.out.println("SENTENCIA DE CONTROL \"IF\"");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero a convertir a string: ");
        var num = Integer.parseInt(entrada.nextLine());
        if (num==1){
            System.out.println("Tu ingresaste el numero: uno");
        }else if(num==2){
            System.out.println("Tu ingresaste el numero: dos");
        }else if(num==3){
            System.out.println("Tu ingresaste el numero: tres");
        }else if(num==4){
            System.out.println("Tu ingresaste el numero: cuatro");
        }else{
            System.out.println("Valor no encontrado");
        }
        
        
        System.out.println("SENTENCIA DE CONTROL \"SWITCH\"");
        System.out.println("Ingresa un numero para saber la estacion:");
        var numEstacion = Integer.parseInt(entrada.nextLine());
        switch(numEstacion){
            case 1:case 2:case 12:
                System.out.println("Estacion de Invierno");
                break;
            case 3: case 4: case 5:
                System.out.println("Estacion de Primavera");
                break;
            case 6: case 7: case 8:
                System.out.println("Estacion de Verano");
                break;
            case 9: case 10: case 11:
                System.out.println("Estacion de Otonio");
                break;
            default:
                System.out.println("Estacion desconocida");
                break;
        }
        
        
        System.out.println("EJERCICIO DE SISTEMA DE CALIFICACIONES");
        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(entrada.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");
    }
}
