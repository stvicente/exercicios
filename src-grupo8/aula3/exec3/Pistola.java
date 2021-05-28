package aula3.exec3;

public class Pistola extends Arma{

    public Pistola(String nome) {
        super(nome);
    }

    @Override
    public void acao() {
        System.out.println("Pa pa pa pa pa");
    }
}
