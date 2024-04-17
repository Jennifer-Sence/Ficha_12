import Enum.Familia;
public class Planta extends SerVivo{
    private Familia familia;
    private int grauDefesa; ;

    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        if (grauDefesa >= 0 && grauDefesa <= 5) {
            this.grauDefesa = grauDefesa;
        } else {
            System.out.println("🥋❌ O grau de defesa deve estar entre 0 e 5.");
        }
    }

    public Familia getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

   @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Familia: " + getFamilia());
        System.out.println("Grau de defesa: " + getGrauDefesa());
    }
}
