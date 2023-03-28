package nemici;
import armi.Arma;
import personaggio.Personaggio;
import java.util.Random;

public class Cavaliere extends Nemico {
    
    private Arma arma;

    public Cavaliere(String classe, int forza, int resistenza, int puntiVita, Arma arma) {
        super(classe, forza, resistenza, puntiVita);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void attacca(Personaggio personaggio){
        if(arma == null){
            System.out.println("Il cavaliere non ha un'arma!");
            return;
        }

        
        int range = arma.getDannoMassimo() - arma.getDannoMinimo() + 1;
        int attacco = new Random().nextInt(range) + arma.getDannoMinimo();
        int dannoEffettivo = attacco + this.getForza();
    
        if(dannoEffettivo > 0){
            personaggio.setPuntiVita(personaggio.getPuntiVita() - dannoEffettivo);
            System.out.println("Il cavaliere ti attacca con " + arma.getNome() + ". Subisci " + dannoEffettivo + " danni.");
        } else {
            System.out.println("Il cavaliere vacilla e non riesce a colpirti, non perdi nessun punto vita.");
        }
    }

    @Override
    public void parata(Personaggio personaggio){
        int difesa = new Random().nextInt((arma.getDifesaMinima() - arma.getDifesaMassima())+1) +arma.getDifesaMassima();
        int difesaEffettiva = difesa + getResistenza();

        if(difesaEffettiva >= personaggio.getAttacco()){
            System.out.println("Il cavaliere para con efficacia il tuo colpo! Non perde punti vita");
        } else {
            System.out.println("Il cavaliere non riesce a parare del tutto il colpo e subisce " + personaggio.getAttacco() + " danni.");
        }
    }

    

}
