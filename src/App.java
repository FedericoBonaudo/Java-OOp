import armi.Arma;
import armi.Scudo;
import armi.Spada;
import nemici.Soldato;
import personaggio.Personaggio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Spada spada = new Spada("spada", 4, 5, 3, 5);
        Soldato soldato = new Soldato("soldato", 10, 5, 20, spada);
        Personaggio personaggio = new Personaggio("Federico", 10, 8, 30, new Arma[]{spada});
        Scanner scanner = new Scanner(System.in);

        boolean gioco = true;

        while(gioco){
            System.out.println("-----------------------------------------------");
            System.out.println(" ");
            while(personaggio.getPuntiVita() > 0 && soldato.getPuntiVita() > 0){
                personaggio.combatti(soldato);
                System.out.println(" ");
                if(soldato.getPuntiVita() <= 0){
                    System.out.println("Hai ucciso il soldato!");
                    break;
                }

                soldato.attacca(personaggio);
                if(personaggio.getPuntiVita() <= 0){
                   System.out.println("Sei morto! Il soldato ti ha ucciso");
                   break;
               }
               System.out.println(" ");
               System.out.println("Cosa vuoi fare? \n1. Continua a combattere. \n2. Fuggi.");
               int scelta = scanner.nextInt();
               if(scelta == 1){
                continue;
               } else if(scelta == 2){
                System.out.println("Fuggi a gambe levate!");
                break;
               }
            }
            System.out.println(" ");
            System.out.println("-----------------------------------------------");
            
            gioco = false;

        }

    }
}
