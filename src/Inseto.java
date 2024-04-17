public class Inseto extends SerVivo{
    private boolean ehVenenoso;

    public Inseto(String nome, String especie, String pais, int idade, boolean ehVenenoso) {
        super(nome, especie, pais, idade);
        this.ehVenenoso = ehVenenoso;
    }
}
