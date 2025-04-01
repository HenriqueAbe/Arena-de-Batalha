import java.util.ArrayList;
import java.util.Random;

public class Batalha {
    private ArrayList<Personagem> personagems;
    private ArrayList<Inimigo> inimigos;
    private Random random = new Random();

    public Batalha(ArrayList<Personagem> personagems, ArrayList<Inimigo> inimigos) {
        this.personagems = personagems;
        this.inimigos = inimigos;
    }


}
