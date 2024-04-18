import java.util.ArrayList;
import Enum.Dieta;

public class Animal extends SerVivo{
    private boolean fome;
    private double peso; //em kg
    private int inteligencia;
    private Dieta alimentacaoDieta;
    private String barulho;

    public String getBarulho() {
        return barulho;
    }

    public double getPeso() {
        return peso;
    }

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, int inteligencia, Dieta alimentacaoDieta, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        if (inteligencia >= 0 && inteligencia <= 100) {
            this.inteligencia = inteligencia;
        } else {
            System.out.println("🥋❌ A inteligência deve estar entre 0 e 100.");
            throw new IllegalArgumentException();
        }

        this.alimentacaoDieta = alimentacaoDieta;
        this.barulho = barulho;
    }


}
