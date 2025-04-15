public class Personagem {
    private String nome;
    protected int vida;
    protected int dano;
    protected int defesa;

    public Personagem(String nome, int vida, int dano, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }
}
