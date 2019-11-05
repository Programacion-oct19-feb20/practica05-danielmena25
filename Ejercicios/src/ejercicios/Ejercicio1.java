/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia ha pagado 3 cuotas de navidad de sus hijos la cuota 1 fue 
 * de 15 dolares, la cuota 2 de 10 dolares, la cuota 3 de 16 dolares generar
 * un programa en lenguaje java que permita ingresar por teclado los valores de
 * las cuotas luego presentar el promedio de dolares pagados entre las cuotas 
 * ademas presentar un mensaje en pantalla (true o false) dependiendo del 
 * promedio si el promedio es mayor o igual a 11 deberia salir true si el 
 * promedio es menor a 11 deberia salir false
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombresPadre;
        int cuota1 = 15;
        int cuota2 = 10;
        int cuota3 = 16;
        int suma = cuota1 + cuota2 + cuota3;
        double division = cuota1 + cuota2 + cuota3 / 2;
        
        System.out.println("Ingrese los nombres del padre de familia");
        nombresPadre = entrada.nextLine();
        System.out.println("Ingrese el valor de la cuota 1");
        cuota1 = entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota 2");
        cuota2 = entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota 3");
        cuota3 = entrada.nextInt();
        
        System.out.printf("Suma: %d + %d + %d = %d\n", cuota1, 
                cuota2, cuota3, suma);
        System.out.printf("Division: %d / %d = %.3f\n", suma, 3 , 
                division); 
              
        
        
        
        
    }
}
