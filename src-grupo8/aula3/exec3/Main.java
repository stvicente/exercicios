package aula3.exec3;

public class Main {
    public static void main(String[] args) {
        Arma arma = new Pistola("Glock");
        Personagem personagem = new Personagem("Gabriel", "Mago", 1, arma);
        personagem.ataca();
        arma = new Fuzil("AK");
        personagem.setArma(arma);
        personagem.ataca();
        System.out.println(personagem);
    }
}
