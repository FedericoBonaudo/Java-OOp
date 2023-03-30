package nemici;
import armi.Arma;
import personaggio.Personaggio;
import java.util.Random;

public class Lanciere extends Nemico {

    public Lanciere(String classe, int forza, int resistenza, int puntiVita, Arma[] inventario) {
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
                    System.out.println("Il soldato riesce a colpirti con " + getInventario()[i].getNome() + ". Ti infligge " + dannoEffettivo + " danni.");
                    System.out.println("Ti rimangono " + personaggio.getPuntiVita() + " punti vita.");
                } else {
                    System.out.println("La guardi vacilla e non ti colpisce");
                }
            }  else {
                System.out.println("Il valore è null");
            }
        }

    }

    @Override
    public Arma getArma() {
        return super.getArma();
    }

    @Override
    public String getClasse() {
        return super.getClasse();
    }

    @Override
    public int getForza() {
        return super.getForza();
    }

    @Override
    public Arma[] getInventario() {
        return super.getInventario();
    }

    @Override
    public int getPuntiVita() {
        return super.getPuntiVita();
    }

    @Override
    public int getResistenza() {
        return super.getResistenza();
    }

    @Override
    public void setArma(Arma arma) {
        super.setArma(arma);
    }

    @Override
    public void setClasse(String classe) {
        super.setClasse(classe);
    }

    @Override
    public void setForza(int forza) {
        super.setForza(forza);
    }
    
    
    
}
