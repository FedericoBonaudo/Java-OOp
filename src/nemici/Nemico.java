package nemici;
import armi.Arma;
import interfaces.puoAttaccare;
import personaggio.Personaggio;
import java.util.Random;

public class Nemico implements puoAttaccare<Personaggio>{
    
    private Arma arma;
    private String classe;
    private int forza;
    private int resistenza;
    private int puntiVita;
    private Arma[] inventario;

    public Nemico(String classe, int forza, int resistenza, int puntiVita, Arma[] inventario) {
        this.classe = classe;
        this.forza = forza;
        this.resistenza = resistenza;
        this.puntiVita = puntiVita;
        this.inventario = inventario;
    }



    public void attacca(Personaggio personaggio){

        

        for(int i=0; i < inventario.length; i++){
            if(inventario[i] instanceof Arma){
                
                int danni = new Random().nextInt((inventario[i].getDannoMassimo() - inventario[i].getDannoMinimo())+1) + inventario[i].getDannoMinimo();
                int dannoEffettivo = (danni + this.getForza()) - personaggio.getDifesa();
        
                if(dannoEffettivo > 0){
                    personaggio.setPuntiVita(personaggio.getPuntiVita() - dannoEffettivo);
                    System.out.println("Il soldato riesce a colpirti con " + inventario[i].getNome() + ". Ti infligge " + dannoEffettivo + " danni.");
                    System.out.println("Ti rimangono " + personaggio.getPuntiVita() + " punti vita.");
                } else {
                    System.out.println("La guardi vacilla e non ti colpisce");
                }
            }  else {
                System.out.println("Il valore è null");
            }
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

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma[] getInventario() {
        return inventario;
    }

    public void setInventario(Arma[] inventario) {
        this.inventario = inventario;
    }
    
}
