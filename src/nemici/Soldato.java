package nemici;
import armi.Arma;
import personaggio.Personaggio;
import java.util.Random;

public class Soldato extends Nemico {

    public Soldato(String classe, int forza, int resistenza, int puntiVita, Arma[] inventario) {
        super(classe, forza, resistenza, puntiVita, inventario);
    }

    @Override
    public void attacca(Personaggio personaggio){

        for(int i=0; i < getInventario().length; i++){
            if(getInventario()[i] instanceof Arma){
                
                int danni = new Random().nextInt((getInventario()[i].getDannoMassimo() - getInventario()[i].getDannoMinimo())+1) + getInventario()[i].getDannoMinimo();
                int dannoEffettivo = (danni + this.getForza()) - personaggio.getDifesa();
        
                if(dannoEffettivo > 0){
                    personaggio.setPuntiVita(personaggio.getPuntiVita() - dannoEffettivo);
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Il soldato riesce a colpirti con " + getInventario()[i].getNome() + ". Ti infligge " + dannoEffettivo + " danni.");
                    System.out.println("Ti rimangono " + personaggio.getPuntiVita() + " punti vita.");
                    System.out.println(" ");
                    System.out.println("---------------------------------------------------------------------------------");
                } else {
                    System.out.println("La guardi vacilla e non ti colpisce");
                }
            }  else {
                System.out.println("Il valore è null");
            }
        }

    }
    }

    
    
