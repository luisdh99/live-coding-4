
import java.util.Scanner;

public class Codigo4 {
    
    public static void main(String[] args) {
  
        Scanner s = new Scanner();  

  
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();  

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();

      
        if (j1 == j2)
            System.out.println("Empate");
        } else {
            
            int ganador = 2; 

            
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1; 
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;  
                    }
                    break;

                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;  /
                    break;

                default:
                    
                    System.out.println("Jugada inválida del jugador 1");
                    return; // Termina el programa
            }

            
            System.out.println("Gana el jugador " + ganador);
        }

}