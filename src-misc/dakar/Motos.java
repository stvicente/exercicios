package dakar;

public class Motos extends Veiculo{

    public Motos(double velocidade, double aceleracao, double anguloDeGiro, double peso, String placa, int rodas) {
        super(velocidade, aceleracao, anguloDeGiro, peso, placa, rodas);
    }

//    public String getPlaca() {
//        return placa;
//    }

    @Override
    public String toString() {
        return "Motos{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", peso=" + peso +
                ", placa='" + placa + '\'' +
                ", rodas=" + rodas +
                '}';
    }
}
