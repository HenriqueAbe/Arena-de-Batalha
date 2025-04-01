public class Inimigo {
    private String nome;
    private int vida;
    private int dano;
    private int defesa;

    public Inimigo(String nome, int vida, int dano, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public int getDefesa() {
        return defesa;
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
        System.out.println(this.nome + " recebeu " + danoReal + " de dano!");
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}







