package aula3.exec3;

public class Personagem {

    private String nome;
    private String classe;
    private int level;
    private Arma arma;

    public Personagem(String nome, String classe, int level, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.level = level;
        this.arma = arma;
    }

    public void ataca(){
        this.arma.acao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", level=" + level +
                ", arma=" + arma +
                '}';
    }
}
