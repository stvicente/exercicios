package aula3.exec3;

public class Katana extends Arma{

    public Katana(String nome) {
        super(nome);
    }

    @Override
    public void acao() {
        System.out.println("Corte rápido tramontina");
    }
}
