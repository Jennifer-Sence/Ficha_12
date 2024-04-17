public class SerVivo {
    private String Nome;
    private String especie;
    private String pais;
    private int idade;

    public String getNome() {
        return Nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPais() {
        return pais;
    }

    public int getIdade() {
        return idade;
    }

    public SerVivo(String nome, String especie, String pais, int idade) {
        Nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.println("🔡Nome: " + getNome());
        System.out.println("🐁🪴🐛Especie: " + getEspecie());
        System.out.println("Pais: " + getPais());
        System.out.println("Idade: " + getIdade());

    }
}
