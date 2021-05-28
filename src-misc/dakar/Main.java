package dakar;

import analisepratica.GuardaRoupa;
import analisepratica.Vestuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carros carro1 = new Carros(50, 25, 3, 1000, "1234", 4);
        Carros carro2 = new Carros(60, 20, 5, 1000, "5678", 4);

        List<Carros> c1 = new ArrayList<>();

        c1.add(carro1);
        c1.add(carro2);

        Corrida corrida = new Corrida(23, 5000, "dakar", 3, c1);

        Motos moto1 = new Motos(70, 22, 5, 300, "9012", 2);
        Motos moto2 = new Motos(65, 12, 6, 300, "3456", 2);

        List<Motos> m1 = new ArrayList<>();

        m1.add(moto1);
        m1.add(moto2);

        corrida.registrarMoto(moto1);

        corrida.removerVeiculoPorPlaca(carro1.placa);

        SocorristaMoto s1 = new SocorristaMoto();
        SocorristaCarro s2 = new SocorristaCarro();

        s1.socorrer(moto1.placa);
        s2.socorrer(carro1.placa);

        corrida.registrarMoto(moto2);

        corrida.removerVeiculo(moto1);

        corrida.vencedor();

    }
}
