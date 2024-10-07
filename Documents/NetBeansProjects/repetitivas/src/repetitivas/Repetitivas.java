
package repetitivas;

import java.util.Scanner;

public class Repetitivas {

    
    public static void main(String[] args) {
        int contador= 0;
        
       while (contador <= 10){
          System.out.println("Estoy en la vuelta numero:"+contador);
           contador= contador+1;}
       
       for (int cont= 0; cont<=10 ; cont++){
            System.out.println("Estoy en FOR en la vuelta:"+cont);
        }
    
            System.out.println("Ingrese el numero a contar");
            Scanner teclado = new Scanner (System.in);
            int limite= teclado.nextInt();
            int cont =1;
            while (cont <= limite){
      
                System.out.println("Esta es la lista de numeros:"+cont);
                 cont++;
            }
          
       /*String salida= "salir";
        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner (System.in);
       String entrada = teclado.next();
       while (!entrada.equalsIgnoreCase(salida)){
           System.out.println("La palabra es: "+entrada);
            System.out.println("Ingrese una palabra");
           entrada = teclado.next();
       }*/
               
            
    }

    }
