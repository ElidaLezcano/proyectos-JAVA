
package com.mycompany.navidad;

public class Navidad {
public static void main(String[] args) {
        int altura= 10;
        
        for (int fila =0; fila<altura ; fila++){
            
            for(int espacio=0 ; espacio<(altura-fila-1); espacio++){                                    
              /*
                4 - 0 - 1=3
                4 - 1 - 1=2
                4 - 2 - 1=1
                4 - 3 - 1=0
                */
            System.out.print(" ");
            }
            
           for (int asterisco=0; asterisco<(fila*2)+1; asterisco++) {
                System.out.print("*");
                
            }
             System.out.println("");
        }
        //tronco
        int largoTronco = 3;
        for(int base=0; base<largoTronco ; base++){
            //espacio del tronco
            for(int espacio=0 ; espacio< (altura-2); espacio++){
                System.out.print(" ");
            }
            //rayitas del tronco
            for(int tronco=0; tronco<3; tronco++){
                System.out.print("|");
                
            }
            System.out.println("");    
        }
       
    }
}

    