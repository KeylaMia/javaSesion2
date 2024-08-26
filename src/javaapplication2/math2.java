/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class math2 {
    public static void main (String args[] ) {
        //declarando las variables
        String name; 
        double numeroBase =0; 
        double numeroFinal=0; 
        double numeroResultado;
        
        //instanciando objeto scanner 
        Scanner lectura = new Scanner(System.in);
        
        //solicitar datos a usuario 
        System.out.print("Ingrese su Nombre: ");
        name = lectura.nextLine();
        //solicitar el primer numero
        System.out.print("Hola "+ name +" ingrese el primer numero a evaluar: ");
        //validación del elemento inicial del intervalo
        while(lectura.hasNext()){
            if(lectura.hasNextDouble()){
                numeroBase = lectura.nextDouble();  
                break;
            }else{
                System.out.print("Por favor, ingrese un número válido:");
                lectura.nextLine();
            }
            
        }
        System.out.print("ahora ingrese el segundo numero a evaluar : ");
        //validación del elemento final del intervalo
        while(lectura.hasNext()){
            if(lectura.hasNextDouble()){
                numeroFinal = lectura.nextDouble();  
                break;
            }else{
                System.out.print("Por favor, ingrese un número válido:");
                lectura.nextLine();
            }
        }
        
        //indicando 
        double min = Math.min(numeroBase,numeroFinal);
        double max = Math.max(numeroBase,numeroFinal);
        
        //salida de información
        System.out.println("El numero minimo es: " + min);
        System.out.println("El numero maximo es: " + max);    

    }
}
