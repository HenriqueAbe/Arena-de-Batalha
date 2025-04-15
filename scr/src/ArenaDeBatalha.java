import java.util.ArrayList;

public class ArenaDeBatalha {
    private static ArrayList<Personagem>personagens = new ArrayList<>();
    private static ArrayList<Inimigo>inimigos = new ArrayList<>();

    public static void main(String[] args) {

        personagens.add(new Personagem("Arqueiro", 33, 23, 4));
        personagens.add(new Personagem("Espadachim", 50,15,10));
        personagens.add(new Personagem("Escudeiro", 100,8,20));
        personagens.add(new Personagem("Glass cannon",10, 60,0));


        inimigos.add(new Inimigo("Goblin", 45,17,8));
        inimigos.add(new Inimigo("Esqueleto", 20,27,5));
        inimigos.add(new Inimigo("Orc", 110,4,16));
        inimigos.add(new Inimigo("Glass cannon(inimigo)",10,60,0));
        System.out.println(personagens);
        Batalha batalha = new Batalha(personagens, inimigos);
        batalha.iniciarBatalha();
    }
}