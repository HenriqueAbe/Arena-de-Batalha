import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalha {
    private ArrayList<Heroi> herois;
    private ArrayList<Inimigo> inimigos;
    private Random random;
    private int primeiroAtaque;
    private Scanner scanner;

    public Batalha(ArrayList<Heroi> personagens, ArrayList<Inimigo> inimigos) {
        this.herois = personagens;
        this.inimigos = inimigos;
        this.random = new Random();
        this.primeiroAtaque = random.nextInt(2) + 1;
        this.scanner = new Scanner(System.in);
    }

    private void atacarPersonagem(Heroi atacante, Inimigo defensor) {
        int dano = atacante.calcularDanoCausado();
        defensor.receberDano(dano);
    }

    private void atacarInimigo(Inimigo atacante, Heroi defensor) {
        int dano = atacante.calcularDanoCausado();
        defensor.receberDano(dano);
    }


    public void iniciarBatalha() {
        System.out.println("Início da batalha!");

        System.out.println("Ranking Heróis: " + herois);

        System.out.println("Nível escuridão Inimigos: " + inimigos);

        if (primeiroAtaque == 1) {
            System.out.print("Personagens atacam primeiro!\nPressione ENTER para continuar.");
            scanner.nextLine();
        } else if (primeiroAtaque == 2) {
            System.out.print("Inimigos atacam primeiro!\nPressione ENTER para continuar.");
            scanner.nextLine();
        }

        while (!herois.isEmpty() && !inimigos.isEmpty()) {
            Heroi personagem = herois.get(random.nextInt(herois.size()));
            Inimigo inimigo = inimigos.get(random.nextInt(inimigos.size()));

            System.out.println("----- Novo Turno -----");

            if (primeiroAtaque == 1) {
                System.out.println(personagem.getNome() + " contra " + inimigo.getNome());
                atacarPersonagem(personagem, inimigo);
                System.out.println("------------------------------------------------");
                if (inimigo.estaVivo()) {
                    System.out.println(inimigo.getNome() + " contra " + personagem.getNome());
                    atacarInimigo(inimigo, personagem);
                    System.out.print("Para ir para o próximo turno pressione ENTER.");
                    scanner.nextLine();
                }
            } else if (primeiroAtaque == 2) {
                System.out.println(inimigo.getNome() + " contra " + personagem.getNome());
                atacarInimigo(inimigo,personagem);
                System.out.println("------------------------------------------------");
                if (personagem.estaVivo()) {
                    System.out.println(personagem.getNome() + " contra " + inimigo.getNome());
                    atacarPersonagem(personagem, inimigo);
                    System.out.print("Para ir para o próximo turno pressione ENTER.");
                    scanner.nextLine();
                }
            }

            if (!personagem.estaVivo()) {
                System.out.println(personagem.getNome() + " foi derrotado!");
                System.out.print("Pressione ENTER para o próximo turno.");
                scanner.nextLine();
                herois.remove(personagem);
            }
            if (!inimigo.estaVivo()) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
                System.out.print("Pressione ENTER para o próximo turno.");
                scanner.nextLine();
                inimigos.remove(inimigo);
            }
        }

        System.out.println("=== Resultado Final ===");
        if (herois.isEmpty()) {
            System.out.println("Inimigos venceram a batalha!");
        } else {
            System.out.println("Personagens venceram a batalha!");
        }
    }
}
