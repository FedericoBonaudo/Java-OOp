package armi;
import java.util.Random;

public class Arma {
    
    private String nome;
    private int dannoMinimo;
    private int dannoMassimo;
    private int difesaMinima;
    private int difesaMassima;
    
    public Arma(String nome, int dannoMinimo, int dannoMassimo, int difesaMinima, int difesaMassima) {

        this.nome = nome;
        this.dannoMinimo = dannoMinimo;
        this.dannoMassimo = dannoMassimo;
        this.difesaMinima = difesaMinima;
        this.difesaMassima = difesaMassima;
    }

    public int getDannoMinimo() {
        return dannoMinimo;
    }

    public int getDannoMassimo() {
        return dannoMassimo;
    }

    public int getDifesaMinima() {
        return difesaMinima;
    }

    public int getDifesaMassima() {
        return difesaMassima;
    }

    public void setDannoMinimo(int dannoMinimo) {
        this.dannoMinimo = dannoMinimo;
    }

    public void setDannoMassimo(int dannoMassimo) {
        this.dannoMassimo = dannoMassimo;
    }

    public void setDifesaMinima(int difesaMinima) {
        this.difesaMinima = difesaMinima;
    }

    public void setDifesaMassima(int difesaMassima) {
        this.difesaMassima = difesaMassima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
