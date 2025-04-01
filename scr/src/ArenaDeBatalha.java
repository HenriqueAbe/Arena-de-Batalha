import java.util.ArrayList;

public class ArenaDeBatalha {
    private static ArrayList<Personagem>personagens = new ArrayList<>();
    private static ArrayList<Inimigo>inimigos = new ArrayList<>();

    public static void main(String[] args) {


        personagens.add(new Personagem("Arqueiro", 5, 7, 2));
        personagens.add(new Personagem("Espadachim", 2,5,2));
        personagens.add(new Personagem("Escudeiro", 12,2,6));


        inimigos.add(new Inimigo("Goblin", 7,3,3));
        inimigos.add(new Inimigo("Esqueleto", 2,5,2));
        inimigos.add(new Inimigo("Orc", 12,2,6));


        Batalha batalha = new Batalha(personagens, inimigos);
        batalha.iniciarBatalha();


    }
}