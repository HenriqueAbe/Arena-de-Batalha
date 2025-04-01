import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalha {
    private ArrayList<Personagem> personagens;
    private ArrayList<Inimigo> inimigos;
    private Random random;
    private int primeiroAtaque;
    private Scanner scanner;

    public Batalha(ArrayList<Personagem> personagens, ArrayList<Inimigo> inimigos) {
        this.personagens = personagens;
        this.inimigos = inimigos;
        this.random = new Random();
        this.primeiroAtaque = random.nextInt(2) + 1;
        this.scanner = new Scanner(System.in);
    }

    private void atacarPersonagem(Personagem atacante, Inimigo defensor) {
        int dano = atacante.calcularDanoCausado();
        defensor.receberDano(dano);
    }

    private void atacarInimigo(Inimigo atacante, Personagem defensor) {
        int dano = atacante.calcularDanoCausado();
        defensor.receberDano(dano);
    }


    public void iniciarBatalha() {
        System.out.println("Início da batalha!");

        if (primeiroAtaque == 1) {
            System.out.println("Personagens atacam primeiro!");
        } else if (primeiroAtaque == 2) {
            System.out.println("Inimigos atacam primeiro!");
        }

        while (!personagens.isEmpty() && !inimigos.isEmpty()) {
            Personagem personagem = personagens.get(random.nextInt(personagens.size()));
            Inimigo inimigo = inimigos.get(random.nextInt(inimigos.size()));

            System.out.println("\n----- Novo Turno -----");
            System.out.println(personagem.getNome() + " contra " + inimigo.getNome());

            if (primeiroAtaque == 1) {
                atacarPersonagem(personagem, inimigo);
                if (inimigo.estaVivo()) {
                    atacarInimigo(inimigo, personagem);
                    System.out.print("Para ir para o próximo turno pressione ENTER.");
                    scanner.nextLine();
                }
            } else if (primeiroAtaque == 2) {
                atacarInimigo(inimigo,personagem);
                if (personagem.estaVivo()) {
                    atacarPersonagem(personagem, inimigo);
                    System.out.print("Para ir para o próximo turno pressione ENTER.");
                    scanner.nextLine();
                }
            }

            if (!personagem.estaVivo()) {
                System.out.println(personagem.getNome() + " foi derrotado!");
                System.out.print("Pressione ENTER para o próximo turno.");
                scanner.nextLine();
                personagens.remove(personagem);
            }
            if (!inimigo.estaVivo()) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
                System.out.print("Pressione ENTER para o próximo turno.");
                scanner.nextLine();
                inimigos.remove(inimigo);
            }
        }

        System.out.println("\n=== Resultado Final ===");
        if (personagens.isEmpty()) {
            System.out.println("Inimigos venceram a batalha!");
        } else {
            System.out.println("Personagens venceram a batalha!");
        }
    }
}
