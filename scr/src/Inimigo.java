public class Inimigo extends Pessoa{

    public Inimigo(String nome, int vida, int dano, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int calcularDanoCausado() {
        return this.dano;
    }

    public void receberDano(int dano) {
        int danoReal = dano - this.defesa;
        if (danoReal <= 1) {
            danoReal = 1;
            System.out.println("A defesa de " + this.nome + " reduziu o dano para 1!");
        }
        this.vida -= danoReal;
        if (this.vida <= 0) {
            System.out.println(this.nome + " recebeu " + danoReal + " de dano!");
            System.out.println("Vida do(a) " + this.nome + ": 0.");
        } else {
            System.out.println(this.nome + " recebeu " + danoReal + " de dano!");
            System.out.println("Vida do(a) " + this.nome + ": " + this.vida );
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}







