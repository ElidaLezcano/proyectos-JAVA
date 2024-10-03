package rellenarmatriz;
public class RellenarMatriz {


   public static void main(String[] args) {
       
    int matriz [][] = new int [4][5];   
    
    //rellenar con 5
    for (int f=0; f<4; f++) {
        for (int c=0; c<5; c++) {
            matriz[f][c] = 5;
        }
    }
    
    //mostrar por pantalla
     for (int f=0; f<4; f++) {
        for (int c=0; c<5; c++) {
            
           System.out.print(matriz[f][c]); 
        }
         System.out.print("\n");
    }
      
        
    }
    
}
