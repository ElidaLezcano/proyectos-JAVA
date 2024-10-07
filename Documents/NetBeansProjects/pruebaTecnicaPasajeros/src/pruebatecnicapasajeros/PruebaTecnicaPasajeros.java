package pruebatecnicapasajeros;

import java.util.Scanner;

public class PruebaTecnicaPasajeros {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        char asientos[][] = new char[10][10];

        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila, asiento;
        String respuesta;
        
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

        System.out.println("BIENVENIDO AL SISTEMA DE RESERVA");
        while (bandera != true){
            System.out.println("Ingrese Fila y Asiento a reservar");
            System.out.print("Fila entre (0 al 9): ");
            fila = teclado.nextInt();

            System.out.print("Asiento entre (0 al 9): ");
            asiento = teclado.nextInt();

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            } 
            else {
                System.out.println("Asiento ocupado, ingrese otro valor");
            }
            System.out.println("¿Desea finalizar la reserva? S: Si. Cualquier otro valor: No.");
            respuesta =teclado.next();
            
            if(respuesta.equalsIgnoreCase("S")){
                bandera= true;
            }
            
            
        }

    }

}
