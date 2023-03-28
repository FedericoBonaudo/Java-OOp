package nemici;
import armi.Arma;
import personaggio.Personaggio;
import java.util.Random;;

public class Soldato extends Nemico {

    public Soldato(String classe, int forza, int resistenza, int puntiVita, Arma arma) {
        super(classe, forza, resistenza, puntiVita);
        this.arma = arma;
    }

    private Arma arma;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void attacca(Personaggio personaggio){
        if(arma == null){
            System.out.println("Il soldato non ha un'arma!");
            return;
        }

        
        int range = arma.getDannoMassimo() - arma.getDannoMinimo() + 1;
        int attacco = new Random().nextInt(range) + arma.getDannoMinimo();
        int dannoEffettivo = (attacco + this.getForza()) - personaggio.getDifesa();
    
        if(dannoEffettivo > 0){
            personaggio.setPuntiVita(personaggio.getPuntiVita() - dannoEffettivo);
            System.out.println("Il soldato ti attacca con " + arma.getNome() + ". Subisci " + dannoEffettivo + " danni.");
            System.out.println("Ti rimangono " + personaggio.getPuntiVita() + " punti vita.");
        } else {
            System.out.println("Il soldato vacilla e non riesce a colpirti, non perdi nessun punto vita.");
        }
    }

    @Override
    public void parata(Personaggio personaggio){
        
        int range = arma.getDifesaMassima() - arma.getDifesaMinima() + 1;
        int difesa = new Random().nextInt(range) + arma.getDifesaMinima();
        int difesaEffettiva = difesa + this.getResistenza();

        if(difesaEffettiva >= personaggio.getAttacco()){
            System.out.println("Il soldato para con efficacia il tuo colpo! Non perde punti vita");
        } else {
            System.out.println("Il soldato non riesce a parare del tutto il colpo e subisce " + personaggio.getAttacco() + " danni.");
        }
    }
    
}