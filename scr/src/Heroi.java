public class Heroi extends Personagem {
    private int ranking;

    public Heroi(String nome, int vida, int dano, int defesa, int ranking) {
        super(nome, vida, dano, defesa);
        this.ranking = ranking;
    }

    public String toString() {
        return getNome() + ": Ranking: " + ranking;

    }


}
