package armi;
import java.util.Random;

public class Lancia extends Arma{

    public Lancia(String nome, int dannoMinimo, int dannoMassimo, int difesaMinima, int difesaMassima) {
        super(nome, dannoMinimo, dannoMassimo, difesaMinima, difesaMassima);
    }

    @Override
    public void siRompe(){
        int rottura = new Random().nextInt(10) + 1;
        if(rottura == 10){
            System.out.println("La lancia si è rotta! Dovrai procurartene una al più presto.");
        }

    }
}
