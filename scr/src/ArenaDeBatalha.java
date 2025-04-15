import java.util.ArrayList;

public class ArenaDeBatalha {
    private static ArrayList<Heroi>herois = new ArrayList<>();
    private static ArrayList<Inimigo>inimigos = new ArrayList<>();

    public static void main(String[] args) {

        herois.add(new Heroi("Arqueiro", 33, 23, 4,3));
        herois.add(new Heroi("Espadachim", 50,15,10,5));
        herois.add(new Heroi("Escudeiro", 100,8,20,4));
        herois.add(new Heroi("Glass cannon",10, 60,0,10));

        inimigos.add(new Inimigo("Goblin", 45,17,8, 2));
        inimigos.add(new Inimigo("Esqueleto", 20,27,5, 1));
        inimigos.add(new Inimigo("Orc", 110,4,16, 5));
        inimigos.add(new Inimigo("Glass cannon(inimigo)",10,60,0, 10));

        Batalha batalha = new Batalha(herois, inimigos);
        batalha.iniciarBatalha();
    }
}