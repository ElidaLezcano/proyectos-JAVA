package reservasvuelos;

import java.util.Scanner;

public class ReservasVuelos {

    public static void main(String[] args) {
        int vuelos[][] = new int[6][3];
        int destino, horario, asientos, pasajes;

        Scanner teclado = new Scanner(System.in);
        //Cargar las matrices
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " y el horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        while (!bandera.equalsIgnoreCase("finish")) {

            System.out.println("Ingrese el numero del destino");
            destino = teclado2.nextInt();
            System.out.println("Ingrese el numero del horario");
            horario = teclado2.nextInt();
            System.out.println("Cuantos asientos desea reservar");
            asientos = teclado2.nextInt();

            if (destino >= 0 && destino <= 5) {

                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("Disculpe, no se pudo completar la operacion dado que no hay asientos disponibles");
                    }
                } else {
                    System.out.println("El numero del horario es invalido, ingrese un numero del 0 al 2 ");
                }
            } else {
                System.out.println("El numero del destino es invalido, ingrese un numero del 0 al 5");
            }
            System.out.println("Si desea seguir reservando presione cualquier valor, si desea terminar escriba finish");
            bandera = teclado2.next();
        }

    }

}
