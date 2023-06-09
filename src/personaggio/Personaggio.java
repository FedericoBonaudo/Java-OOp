package personaggio;
import nemici.Nemico;
import armi.Arma;
import interfaces.puoAttaccare;
import java.util.Random;


public class Personaggio implements puoAttaccare<Nemico>{
    
    private String nome;
    private int attacco;
    private int difesa;
    private int puntiVita;
    private Arma[] inventario;

    public Personaggio(String nome, int attacco, int difesa, int puntiVita, int inventarioDimsioni) {

        this.nome = nome;
        this.attacco = attacco;
        this.difesa = difesa;
        this.puntiVita = puntiVita;
        this.inventario = new Arma[inventarioDimsioni];
    }

    public void aggiungiElemento(Arma arma){
        int massimo = 10;
        for(int i=0; i < massimo; i++){
            if(inventario[i] == null){
                inventario[i] = arma;
            }
        }
    }

    public void attacca(Nemico nemico){


        for(int i=0; i < inventario.length; i++){

            if(inventario[i] instanceof Arma && inventario[i] != null){
                
                int danni = new Random().nextInt((inventario[i].getDannoMassimo() - inventario[i].getDannoMinimo())+1) + inventario[i].getDannoMinimo();
                int dannoEffettivo = (danni + this.getAttacco()) - nemico.getResistenza();
        
                if(dannoEffettivo > 0){
                    nemico.setPuntiVita(nemico.getPuntiVita() - dannoEffettivo);
                    System.out.println("Riesci ad affondare il colpo con " + inventario[i].getNome() + ". Infliggi " + dannoEffettivo + " danni.");
                    System.out.println("A " + nemico.getClasse() + " rimangono " + nemico.getPuntiVita() + " punti vita");
                } else {
                    System.out.println("Non riesci a colpire " + nemico.getClasse());
                }
            }  else {
                System.out.println("Il valore è null");
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public int getAttacco() {
        return attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public Arma[] getInventario() {
        return inventario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setattacco(int attacco) {
        this.attacco = attacco;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public void setInventario(Arma[] inventario) {
        this.inventario = inventario;
    }
}
