package javaapplication2;
import java.util.Scanner;


/**
 *
 * @author macbook
 */
public class UsingMath {
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
        //solicitar la base del intervalo
        System.out.print("Hola "+ name +" ingrese el primer elemento del intervalo: ");
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
        System.out.print("ahora ingrese el ultimo elemento del intervalo para obtener : ");
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
        while(numeroFinal <= numeroBase){
            System.out.print("Por favor, ingrese un número válido mayor al numero base:");
            numeroFinal = lectura.nextDouble(); 
        }
        
        //generando numero aleatorio del intervalo
        int cifrasBase = String.valueOf(numeroBase).length()-3;
        int cifrasFinal = String.valueOf(numeroFinal).length()-3;
        if(cifrasBase < 0  && cifrasFinal <0 ){
           double ale = Math.random() *10 ;
           //salida de información
            System.out.println("El numero aleatorio es: " + ale);
            
        }else if(cifrasBase < 0  && cifrasFinal >0 ){
           double multiploBase = 0;
            for(int i=0; i <= cifrasBase+2; i++){
                multiploBase = Math.pow(10, i);   
            }
            double aleatorio = Math.random() * multiploBase;
            while(aleatorio >= numeroFinal){
                aleatorio = Math.random() * multiploBase;
            }
            //salida de información
            System.out.println("El numero aleatorio es: " + aleatorio);
            
        }
        else {
            double multiploBase = 0;
            for(int i=0; i <= cifrasBase+1; i++){
                multiploBase = Math.pow(10, i);   
            }
            double aleatorio = Math.random() * multiploBase;
            while(aleatorio >= numeroFinal){
                aleatorio = Math.random() * multiploBase;
            }
            //salida de información
            System.out.println("El numero aleatorio es: " + aleatorio);
        }
        

    }
}
