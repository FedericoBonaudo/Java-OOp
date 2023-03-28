package nemici;
import armi.Arma;
import personaggio.Personaggio;
import java.util.Random;

public class Nemico {
    
    private Arma arma;
    private String classe;
    private int forza;
    private int resistenza;
    private int puntiVita;


    public Nemico(String classe, int forza, int resistenza, int puntiVita) {
        this.classe = classe;
        this.forza = forza;
        this.resistenza = resistenza;
        this.puntiVita = puntiVita;
    }

    public void attacca(Personaggio personaggio){
        if(arma == null){
            System.out.println("Il soldato non ha un'arma!");
            return;
        }

        
        int range = arma.getDannoMassimo() - arma.getDannoMinimo() + 1;
        int attacco = new Random().nextInt(range) + arma.getDannoMinimo();
        int dannoEffettivo = attacco + this.getForza();
    
        if(dannoEffettivo > 0){
            personaggio.setPuntiVita(personaggio.getPuntiVita() - dannoEffettivo);
            System.out.println("Il soldato ti attacca con " + arma.getNome() + ". Subisci " + dannoEffettivo + " danni.");
        } else {
            System.out.println("Il soldato vacilla e non riesce a colpirti, non perdi nessun punto vita.");
        }
    }

    public void parata(Personaggio personaggio){
        int difesa = new Random().nextInt((arma.getDifesaMinima() - arma.getDifesaMassima())+1) +arma.getDifesaMassima();
        int difesaEffettiva = difesa + getResistenza();

        if(difesaEffettiva >= personaggio.getAttacco()){
            System.out.println("Il soldato para con efficacia il tuo colpo! Non perde punti vita");
        } else {
            System.out.println("Il soldato non riesce a parare del tutto il colpo e subisce " + personaggio.getAttacco() + " danni.");
        }
    }

    public String getClasse() {
        return classe;
    }
    public int getForza() {
        return forza;
    }
    public int getResistenza() {
        return resistenza;
    }
    public int getPuntiVita() {
        return puntiVita;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setForza(int forza) {
        this.forza = forza;
    }
    public void setResistenza(int resistenza) {
        this.resistenza = resistenza;
    }
    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }
    
}
