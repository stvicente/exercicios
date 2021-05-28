package aula3.exec3;

public abstract class Arma {
    private String nome;

    public Arma(String nome) {
        this.nome = nome;
    }

    public abstract void acao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
