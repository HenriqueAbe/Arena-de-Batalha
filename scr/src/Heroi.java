public class Heroi extends Personagem {
    private int ranking;

    public Heroi(String nome, int vida, int dano, int defesa, int ranking) {
        super(nome, vida, dano, defesa);
        this.ranking = ranking;
    }

    public int calcularDanoCausado() {
        return this.dano;
    }

    public void receberDano(int dano) {
        int danoReal = dano - this.defesa;
        if (danoReal <= 1) {
            danoReal = 1;
            System.out.println("A defesa de " + this.getNome() + " reduziu o dano para 1!");
        }
        this.vida -= danoReal;
        if (this.vida <= 0) {
            System.out.println(this.getNome() + " recebeu " + danoReal + " de dano!");
            System.out.println("Vida do(a) " + this.getNome() + ": 0.");
        } else {
            System.out.println(this.getNome() + " recebeu " + danoReal + " de dano!");
            System.out.println("Vida do(a) " + this.getNome() + ": " + this.vida );
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String toString() {
        return getNome() + ": Ranking: " + ranking;

    }


}
