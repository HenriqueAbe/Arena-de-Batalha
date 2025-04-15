public class Inimigo extends Personagem {
    private int nivelEscuridao;

    public Inimigo(String nome, int vida, int dano, int defesa, int nivelEscuridao) {
        super(nome, vida, dano, defesa);
        this.nivelEscuridao = nivelEscuridao;
    }

    public String toString() {
        return getNome() + ": Ranking: " + nivelEscuridao;
    }
}







