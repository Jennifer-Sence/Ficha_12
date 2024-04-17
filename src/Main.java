import Enum.Familia;
import Enum.Dieta;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Criando um ambiente
        MeioAmbiente ambiente = new MeioAmbiente("Jardim", 10.0); // Nome e quantidade inicial de água

        System.out.println();
        // Adicionar plantas ao ambiente
        SerVivo planta = new Planta("Girassol", "Helianthus", "Brasil", 1, Familia.COMEINSETOS, 3);
        ambiente.adicionarSerVivo(planta);
        SerVivo outraPlanta = new Planta("Rosa", "EspeciesInválida", "PaísInválido", 1, Familia.FLORES, 6); // Grau de defesa inválido
        ambiente.adicionarSerVivo(outraPlanta);
        SerVivo planta3 = new Planta("Violeta", "EspeciesQualquer", "PaísQualquer", 2, Familia.FLORES, 2);
        ambiente.adicionarSerVivo(planta3);
        ambiente.removerSerVivo(planta3);


        //Adicionar insetos ao meio ambiente
        Inseto inseto1 = new Inseto("Inseto1", "Especie1", "Brasil", 1, false);
        Inseto inseto2 = new Inseto("Inseto2", "Especie2", "Brasil", 1, false);
        ambiente.adicionarSerVivo(inseto1);
        ambiente.adicionarSerVivo(inseto2);

        //Adicionar animais ao meio ambiente
        //Construtor --> String nome, String especie, String pais, int idade, boolean fome, double peso, ArrayList<Integer> inteligencia, Dieta alimentacaoDieta, String barulho
        Animal animal1 = new Animal("Dumbo", "Elefante", "Tanzania", 13, false, 120, 30, Dieta.HERBIVORO, "fuumm uuuuh" );
        Animal animal2 = new Animal("Angolana", "Galinha-d'angola", "Angola", 1, false, 10, 20, Dieta.CARNIVORO, "\ttô-fraco" );
        ambiente.adicionarSerVivo(animal1);
        ambiente.adicionarSerVivo(animal2);



        System.out.println();
        ambiente.listarSeres();


        System.out.println("-------------------Barulho-------------------");
        ambiente.animalFazBarulho(5);
        System.out.println();

        System.out.println("----------------------Movimento---------------------------");
        ambiente.animalMovimenta(4);

        System.out.println();
        System.out.println("-------------Animal bebe--------");
        ambiente.animalBebe(4);

        ambiente.insetoChateia(); // Mostra o barulho de um dos insetos
        System.out.println();
        ambiente.insetoChateia();

       /* System.out.println("Antes de plantaComeInsetos:");
        ambiente.listarSeres(); //Lista de todos os seres vivos no meio a ambiente

        boolean plantaComeuInseto = ambiente.plantaComeInsetos(0); // indice da planta no ambiente

        System.out.println("\nDepois da planta comer insetos:");
        ambiente.listarSeres(); // Exibe os seres vivos no ambiente depois de chamar o método

        if (plantaComeuInseto) {
            System.out.println("\nA planta comeu um inseto!");
        } else {
            System.out.println("\nA planta morreu de fome!");
        }*/



        /*
        System.out.println();
        System.out.println("Exibir detalhes de planta 🌹🌲🌱🌻");
        System.out.println();
        planta.exibirDetalhes();
        System.out.println("--------------------------------------------");
        outraPlanta.exibirDetalhes();
        System.out.println("--------------------------------------------");
        planta3.exibirDetalhes();
*/

        //planta abana com venta
        System.out.println("\nPlanta "  + outraPlanta.getNome() +" está a abanar com o vento 🌬️🍃 " );
       ambiente.plantaAbanaComVento(1);

        System.out.println("----------------------------------------------------");
        System.out.println("Plantas bebem agua? 💐🌸🪴🌲🚰🚿🌊");
        // Funçao plantaBebe
        System.out.println("🌊🚰 Água antes: " + ambiente.getAgua());
        boolean plantaBebeu = ambiente.plantaBebe(0); // Índice da planta no ambiente
        System.out.println("Planta bebeu? " + plantaBebeu);
        System.out.println("Água depois: " + ambiente.getAgua());
    }
}
