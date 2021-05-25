package dakar;

public class Carros extends Veiculo{

    public Carros(double velocidade, double aceleracao, double anguloDeGiro, double peso, String placa, int rodas) {
        super(velocidade, aceleracao, anguloDeGiro, peso, placa, rodas);
    }

    @Override
    public String toString() {
        return "Carros{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", peso=" + peso +
                ", placa='" + placa + '\'' +
                ", rodas=" + rodas +
                '}';
    }
}
