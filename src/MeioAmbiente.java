import java.util.ArrayList;
import java.util.Random;

import Enum.Familia;

public class MeioAmbiente {
    private String nome;
    private double agua; //litros de agua no meio
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String meioAmbiente, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<>();
    }

    // Getter e setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e setter para a quantidade de água
    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    // Método para adicionar um ser vivo ao ambiente
    public void adicionarSerVivo(SerVivo ser) {
        seres.add(ser);
    }

    // Método para remover um ser vivo do ambiente
    public void removerSerVivo(SerVivo ser) {
        System.out.println("Ser removido ❌❌");
        seres.remove(ser);
    }

    public void listarSeres() {
        System.out.println("Lista de Seres no Ambiente:");
        for (SerVivo ser : seres) {
            ser.exibirDetalhes();
            System.out.println(); // Adiciona uma linha em branco entre cada ser vivo
        }
    }


    public boolean plantaBebe(int indexPlanta) {
        if (indexPlanta >= 0 && indexPlanta < seres.size() && seres.get(indexPlanta) instanceof Planta) {
            Planta planta = (Planta) seres.get(indexPlanta);
            double aguaConsumida = 0.0;

            // Determina a quantidade de água que a planta irá beber de acordo com a família
            switch (planta.getFamilia()) {
                case ARVORES:
                    aguaConsumida = 1.0;
                    break;
                case FLORES:
                    aguaConsumida = 0.1;
                    break;
                case ERVAS:
                    aguaConsumida = 0.25;
                    break;
                default:
                    break;
            }

            // Verifica se há água suficiente no ambiente para a planta beber
            if (this.agua >= aguaConsumida) {
                this.agua -= aguaConsumida; // Reduz a quantidade de água disponível no ambiente
                return true;
            } else {
                // Se não houver água suficiente, a planta morre e é removida do ambiente
                seres.remove(indexPlanta);
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean plantaComeInsetos(int indexPlanta) {
        if (indexPlanta >= 0 && indexPlanta < seres.size() && seres.get(indexPlanta) instanceof Planta) {
            Planta planta = (Planta) seres.get(indexPlanta);

            // Verifica se a planta é do tipo "ComeInsetos"
            if (planta.getFamilia() == Familia.COMEINSETOS) {
                // Procura por insetos no ambiente
                for (SerVivo ser : seres) {
                    if (ser instanceof Inseto) {
                        // Remove o inseto encontrado
                        seres.remove(ser);
                        return true; // A planta comeu o inseto
                    }
                }
                // Se não houver insetos disponíveis, a planta morre de fome e é removida do ambiente
                seres.remove(planta);
                return false;
            } else {
                // Se a planta não for do tipo "ComeInsetos", ela não pode comer insetos
                System.out.println("Esta planta não é do tipo 'ComeInsetos'. 🦋🐛🐜🪲");
                return false;
            }
        } else {
            // Índice de planta inválido
            System.out.println("Índice de planta inválido.");
            return false;
        }

    }

    public void plantaAbanaComVento(int indexPlanta) {
        if (indexPlanta >= 0 && indexPlanta < seres.size() && seres.get(indexPlanta) instanceof Planta) {
            Planta planta = (Planta) seres.get(indexPlanta);
            System.out.println("Está muito vento 🌬️🍃");
        }
    }

//Void animalFazBarulho(int indexAnimal):
// imprime na consola o barulho do animal.

    public void animalFazBarulho(int indexAnimal) {
        if (indexAnimal >= 0 && indexAnimal < seres.size() && seres.get(indexAnimal) instanceof Animal) {
            Animal animal = (Animal) seres.get(indexAnimal);
            System.out.println("Barulho do animal " + animal.getNome() + " está fazendo: " + animal.getBarulho());
        } else {
            System.out.println("Animal não encontrado ou índice inválido. ❌🐁🐀🦌🦙");
        }
    }

    public void animalMovimenta(int indexAnimal) {
        if (indexAnimal >= 0 && indexAnimal < seres.size() && seres.get(indexAnimal) instanceof Animal) {
            Animal animal = (Animal) seres.get(indexAnimal);
            System.out.println("O " + animal.getNome() + " movimentou-se 🦌🐔🦃🐁");
        } else {
            System.out.println("Indice do animal não encontrado! ❌🐘🐔🦒🍃");
        }
    }

    public boolean animalBebe(int indexAnimal) {
        if (indexAnimal >= 0 && indexAnimal < seres.size() && seres.get(indexAnimal) instanceof Animal) {
            Animal animal = (Animal) seres.get(indexAnimal);
            double aguaConsumida = animal.getPeso() * 0.025; // Calcula a quantidade de agua que o animal pode beber
            if (agua >= aguaConsumida) { // Verifica se ha agua suficientee
                agua -= aguaConsumida; // Diminui a quantidade de agua no ambiente
                System.out.println(animal.getNome() + " bebeu " + aguaConsumida + " litros de água.");
                return true;
            } else {
                System.out.println(animal.getNome() + " morreu de sede! 😭😿💔");
                seres.remove(animal); // Remove o animal do ambiente
                return false;
            }
        } else {
            System.out.println("Animal não encontrado ou índice inválido. ⚠️⚠️");
            return false;
        }
    }

    public boolean animalCome(int indexAnimal){
//-------------------------------------por fazer
        return false;
    }


    public void insetoChateia() {
        Random random = new Random();

        for (SerVivo ser : seres) {
            if (ser instanceof Inseto) {
                Inseto inseto = (Inseto) ser;
                int escolha = random.nextInt(3); // Gera um número aleatório entre 0 e 2

                System.out.print("🐛🐜🐝🪲🐞O inseto " + inseto.getNome() + " está a chatear com o 🔈barulho: ");
                switch (escolha) {
                    case 0:
                        System.out.println("Bzzzz bzzzz");
                        break;
                    case 1:
                        System.out.println("Tic tic tic tic");
                        break;
                    case 2:
                        System.out.println("Pssssssss");
                        break;
                }
            }
        }
    }

}
