
package temperaturasciudades;

import java.util.Scanner;

public class TemperaturasCiudades {

    public static void main(String[] args) {
       String ciudades[] = new String [5];
       Double minimas[] = new Double [5];
       Double maximas[] = new Double [5];
       
       Scanner teclado = new Scanner(System.in);
       Scanner teclado2 = new Scanner(System.in);
       
       
       //Cargar los vectores
       for (int i=0; i<ciudades.length; i++) {
           System.out.println("Ingrese la ciudad " + "posicion " + i);
          ciudades[i] = teclado.next();
          
           System.out.println("Ingrese la minima " + "posicion " + i);
           minimas[i] = teclado2.nextDouble();
           
           System.out.println("Ingrese la maxima " + "posicion " + i);
           maximas[i] = teclado2.nextDouble();
       }
           
           Double minima= 999999999.00;
           int posMin= -1;
           //determinamos la minima
            for(int i=0; i<ciudades.length; i++){
             
               if (minimas[i] < minima){
                   minima = minimas[i];
                   posMin = i;
               }
            }
            
           Double maxima= -9999999.00;    
           int posMax= -1;
           //determinamos la maxima
           for(int i=0; i<ciudades.length; i++) {
               if (maximas[i] > maxima) {
                    maxima= maximas[i];
                    posMax= i;
               }
           }
          
            
       
        System.out.println("La temperatura minima registrada es de: " + minima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura maxima registrada es de: " + maxima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
    }
    
}
