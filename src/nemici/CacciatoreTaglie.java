package nemici;
import armi.Arma;
import personaggio.Personaggio;
import java.util.Random;

public class CacciatoreTaglie extends Nemico {

    public CacciatoreTaglie(String classe, int forza, int resistenza, int puntiVita, Arma[] inventario) {
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
        // TODO Auto-generated method stub
        return super.getClasse();
    }

    @Override
    public int getForza() {
        // TODO Auto-generated method stub
        return super.getForza();
    }

    @Override
    public Arma[] getInventario() {
        // TODO Auto-generated method stub
        return super.getInventario();
    }

    @Override
    public int getPuntiVita() {
        // TODO Auto-generated method stub
        return super.getPuntiVita();
    }

    @Override
    public int getResistenza() {
        // TODO Auto-generated method stub
        return super.getResistenza();
    }

    @Override
    public void setArma(Arma arma) {
        // TODO Auto-generated method stub
        super.setArma(arma);
    }

    @Override
    public void setClasse(String classe) {
        // TODO Auto-generated method stub
        super.setClasse(classe);
    }

    @Override
    public void setForza(int forza) {
        // TODO Auto-generated method stub
        super.setForza(forza);
    }

    @Override
    public void setInventario(Arma[] inventario) {
        // TODO Auto-generated method stub
        super.setInventario(inventario);
    }
    
    
      


}
