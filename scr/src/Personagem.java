public class Personagem {
    private String nome;
    private int vida;
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

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
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

        setVida(getVida() - danoReal);
        if (this.getVida() <= 0) {
            System.out.println(this.getNome() + " recebeu " + danoReal + " de dano!");
            System.out.println("Vida do(a) " + this.getNome() + ": 0.");
        } else {
            System.out.println(this.getNome() + " recebeu " + danoReal + " de dano!");
            System.out.println("Vida do(a) " + this.getNome() + ": " + this.getVida() );
        }
    }

    public boolean estaVivo() {
        return this.getVida() > 0;
    }
}
