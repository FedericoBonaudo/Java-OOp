import armi.Arco;
import armi.Arma;
import armi.Ciottolo;
import armi.Lancia;
import armi.Spada;
import nemici.Lanciere;
import nemici.Soldato;
import personaggio.Personaggio;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Arco arco = new Arco("arco", 20, 25, 0, 3);
        Spada spada = new Spada("spada", 4, 5, 3, 5);
        Lancia lancia = new Lancia("lancia", 3, 4, 5, 10);
        Soldato soldato = new Soldato("soldato", 10, 5, 50, new Arma[]{spada});
        Lanciere lanciere = new Lanciere("lanciere", 8, 5, 30, new Arma[] {lancia});
        Ciottolo ciottolo = new Ciottolo("ciottolo", 3, 8, 0, 0);
        Personaggio personaggio = new Personaggio("Federico", 10, 8, 30, 10);

        Scanner scanner = new Scanner(System.in);

        boolean gioco = true;
        Random random = new Random();


        while(gioco){
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println(" ");

            System.out.println("Ti trovi sdraiato sul pavimento di pietra fredda della cella, con le mani legate dietro la schiena. La tua armatura è stata rimossa e indossi solo abiti logori e sporchi.\nI tuoi stivali hanno appena resistito alla lunga marcia che ti ha portato qui. La cella si trova in una torre imponente, con una sola finestra di ferro che getta una flebile luce sulle pareti sporche e umide. \nPuoi sentire il rumore delle gocce d'acqua che cadono dalle pareti e il rumore dei topi che corrono lungo il pavimento. Hai combattuto valorosamente nella battaglia di Crecy, ma hai visto la sconfitta del tuo esercito e la morte di molti dei tuoi compagni d'armi. Non avresti mai pensato di finire in una cella inglese come prigioniero di guerra. \nTi chiedi cosa ti succederà e se sarai mai liberato. Pensi alla tua famiglia, ai tuoi amici e ai tuoi compagni d'armi e ti chiedi se li rivedrai mai.");
            System.out.println(" ");
            System.out.println("Mentre giaci lì, senti il rumore dei passi che si avvicinano alla tua cella. \nUna piccola finestra nella porta di legno si apre e il tuo carceriere ti getta un pezzo di pane raffermo e una brocca di acqua sporca.");
            System.out.println(" ");
            System.out.println("'È tutto quello che hai per me?' chiedi in francese.");
            System.out.println(" ");
            System.out.println("'Sì, è tutto quello che ti spetta', risponde il carceriere in inglese prima di chiudere la finestra e allontanarsi.");
            System.out.println(" ");
            System.out.println("Ti siedi e prendi un morso del pane secco e amaro, poi bevi un sorso di acqua, cercando di dimenticare la tua sete crescente. Guardando intorno alla tua cella, cerchi un modo per uscire, ma le pareti sono troppo spesse e le porte troppo solide. Devi trovare un modo per fuggire da lì, ma per il momento sei completamente impotente, intrappolato in questa cella buia e umida, solo con i tuoi pensieri.");
            System.out.println(" ");

            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println(" ");

            System.out.println("Cosa vuoi fare? \n\n1.Mangia\n");
            int pgScelta = scanner.nextInt();
            if(pgScelta == 1){
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println("Con riluttanza, prendi un altro morso del pane secco e masticando, ti accorgi che è tanto duro da sembrare di legno. Poi bevi un altro sorso di acqua e senti qualcosa di duro in bocca. Tossendo, sputi e scopri che hai trovato un ciottolo nella brocca. Soffri per la sete, ma hai anche paura di bere ancora perché temi che ci possa essere altro nella brocca. Decidi di conservare l'acqua per quando avrai bisogno veramente, perché non sai quanto tempo passerà prima che qualcuno venga a liberarti.");
                 personaggio.aggiungiElemento(ciottolo);
                System.out.println(" ");
            } 

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println(" ");
            System.out.println("Hai aggiunto all'inventario: ");
                for (Arma a : personaggio.getInventario()) {
                    if (a != null) {
                    System.out.println(a.getNome());
                    }
                }
            System.out.println(" ");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------------------------");
            soldato.attacca(personaggio);
            
            System.out.println("Mentre tossivi a causa del ciottolo, senti dei passi avvicinarsi alla tua cella. La porta si apre di colpo e un soldato entra, infastidito dal rumore. \n'Che diavolo sta succedendo qui?' urla il soldato. \nTi guardi intorno e vedi il soldato che si avvicina a te con una spada in mano.");
            System.out.println(" ");
            System.out.println("Cosa fai? \n\n1. Lo cogli di sopresa col ciottolo. \n\n2. Tenti di scappare.");
            System.out.println(" ");
            int sceltaCiottolo = scanner.nextInt();
            System.out.println(" ");
            if(sceltaCiottolo == 1){
                int numeroCasuale = random.nextInt(10) + 1;
                if(numeroCasuale >=0 && numeroCasuale <= 4){
                    System.out.println(" ");
                    System.out.println("Tu ascolti, pronto a difenderti, ma la guardia apre la porta e si avvicina, mostrando le sue intenzioni violente. All'improvviso, senza esitazione, prendi il ciottolo che hai trovato nella brocca e lo lanci con tutta la tua forza. Il ciottolo colpisce la guardia al collo, piantandosi nella carne.\nLa guardia fa un rumore soffocato e cade a terra, con le mani che cercano di rimuovere il ciottolo dal collo.");

                } else if(numeroCasuale >=5 && numeroCasuale <=8){
                    System.out.println("Tu ascolti, pronto a difenderti, ma la guardia apre la porta e si avvicina, mostrando le sue intenzioni violente. All'improvviso, senza esitazione, prendi il ciottolo che hai trovato nella brocca e lo lanci con tutta la tua forza. Il ciottolo colpisce la guardia al petto, piantandosi nella carne. La guardia urla di dolore, ma riesce a tenere la spada in mano. Si avvicina per colpirti.");
                    System.out.println(" ");
                    System.out.println("Inizia il combattimento, la guardia è ferita e tu sei un cavaliere esperto.");
                    System.out.println(" ");
                    System.out.println("1. Inizia il combattimento");
                    System.out.println(" ");
                    int iniziaCombattimento = scanner.nextInt();
                    if(iniziaCombattimento == 1){
                        while(personaggio.getPuntiVita() > 0 && soldato.getPuntiVita() > 0){
                        personaggio.attacca(soldato);
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
                       int sceltaCombattimento = scanner.nextInt();
                       if(sceltaCombattimento == 1){
                        continue;
                       } else if(sceltaCombattimento == 2){
                        System.out.println("Fuggi a gambe levate!");
                        break;
                       }
                    }
                    }

                }
            }
            System.out.println(" ");
            System.out.println("-----------------------------------------------");
            
            gioco = false;

        }

    }
}


