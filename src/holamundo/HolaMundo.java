
package holamundo;

import java.util.Scanner;


public class HolaMundo {

  /*IF/ELSE*/
    public static void main(String[] args) {
        double sueldo;
        int categoria;
        
        System.out.println("Ingrese la categoria que desea calcular el sueldo");
        Scanner input = new Scanner (System.in);
        categoria = input.nextInt();
        
        if (categoria ==1){
            sueldo= 15.890+(15.890*0.10);
            System.out.println("El sueldo es:"+sueldo);
        }
        else {
            if (categoria ==2){
            sueldo = 25.630;
            System.out.println("El sueldo es:"+sueldo);
        }
            else {
                if (categoria== 3){
             sueldo= 35.560 -(35.560*0.11);
             System.out.println("El sueldo es:"+sueldo);
         }   
                else { 
                    System.out.println("Debe ingresar un numero valido");
                }      
                            }          
    
        }
        
         
    }
 }
