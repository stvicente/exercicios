package dakar;

import java.util.*;
import java.util.stream.Collectors;

public class Corrida {
    private double distancia;
    private double premioEmDol;
    private String nome;
    private int qtdDeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;

    public Corrida(double distancia, double premioEmDol, String nome, int qtdDeVeiculosPermitidos, List listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDol = premioEmDol;
        this.nome = nome;
        this.qtdDeVeiculosPermitidos = qtdDeVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(Carros carro){
        int qtd = getQtdDeVeiculosPermitidos();
        int list = getListaVeiculos().size();
        if( qtd > list){
            listaVeiculos.add(carro);
        } else {
            System.out.println("Limite de veículos atingido");
        }
    };

    public void registrarMoto(Motos moto){
        int qtd = getQtdDeVeiculosPermitidos();
        int list = getListaVeiculos().size();
        if( qtd > list){
            listaVeiculos.add(moto);
        } else {
            System.out.println("Limite de veículos atingido");
        }
    };

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    };

    public void removerVeiculoPorPlaca(String placa){
        listaVeiculos.removeIf(veiculo -> veiculo.placa == placa);
    };

    public void vencedor(){
        Map<String, Double> veiculos = new HashMap<String, Double>();
        for(Veiculo veiculo : listaVeiculos){
            veiculos.put(veiculo.placa, (veiculo.velocidade *  veiculo.aceleracao / ( veiculo.anguloDeGiro * (veiculo.peso - veiculo.rodas * 100))));
        }
        Optional<Map.Entry<String, Double>> maxEntry = veiculos.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        List vencedor =  listaVeiculos.stream().filter(veiculo -> veiculo.placa == maxEntry.get().getKey()).collect(Collectors.toList());
        System.out.println("O vencedor é "+ vencedor);
    };


    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDol() {
        return premioEmDol;
    }

    public void setPremioEmDol(double premioEmDol) {
        this.premioEmDol = premioEmDol;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDeVeiculosPermitidos() {
        return qtdDeVeiculosPermitidos;
    }

    public void setQtdDeVeiculosPermitidos(int qtdDeVeiculosPermitidos) {
        this.qtdDeVeiculosPermitidos = qtdDeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDol=" + premioEmDol +
                ", nome='" + nome + '\'' +
                ", qtdDeVeiculosPermitidos=" + qtdDeVeiculosPermitidos +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }

}
