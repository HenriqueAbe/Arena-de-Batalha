import java.util.ArrayList;

public class ArenaDeBatalha {
    private static ArrayList<Personagem> personagens = new ArrayList<>();
    private static ArrayList<Inimigo> inimigos = new ArrayList<>();

    public static void main(String[] args) {
        Inimigo goblin = new Inimigo("Goblin", 8, 3, 3);
        inimigos.add(goblin);

        Inimigo mago = new Inimigo("Mago", 5, 8,1);
        inimigos.add(mago);

        Inimigo touro = new Inimigo("Touro", 14, 2, 7);
        inimigos.add(touro);

        Personagem escudeiro = new Personagem("Escudeiro", 15, 1, 10);
        personagens.add(escudeiro);

        Personagem arqueiro = new Personagem("Arqueiro", 5, 9, 0);
        personagens.add(arqueiro);

        Personagem espadachim = new Personagem("Espadachim", 8, 4, 2);
        personagens.add(espadachim);
    }
}