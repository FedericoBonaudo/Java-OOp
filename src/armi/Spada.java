package armi;
import java.util.Random;

public class Spada extends Arma {

    public Spada(String nome, int dannoMinimo, int dannoMassimo, int difesaMinima, int difesaMassima) {
        super(nome, dannoMinimo, dannoMassimo, difesaMinima, difesaMassima);
    }

    @Override
    public void siRompe(){
        int rottura = new Random().nextInt(10) + 1;
        if(rottura == 10){
            System.out.println("La spada si è rotta! Dovrai procurartene una al più presto.");
        }

    }
}
