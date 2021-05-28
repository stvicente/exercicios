package com.calculadoram2.calculadoram2.service;

import com.calculadoram2.calculadoram2.domain.Casa;
import com.calculadoram2.calculadoram2.domain.Comodo;
import com.calculadoram2.calculadoram2.domain.Info;
import com.calculadoram2.calculadoram2.domain.Metragem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InfoService {
    private static Casa casa;

    public Info showInfo(Casa casa){
        Info informacoes = new Info();
        double metragem = metragemTotal(casa.comodo);
        informacoes.setMetragemTotal(metragem);
        informacoes.setMaiorComodo(maiorComodo(casa.comodo));
        informacoes.setValor(metragem*800);
        informacoes.setMetragemPorComodo(metragemPorComodo(casa.comodo));
        return informacoes;
    }

    public Comodo maiorComodo(List<Comodo> comodo){
        Comodo maior = comodo
                .stream()
                .max(Comparator.comparing(v -> (v.getLargura()*v.getLargura())))
                .get();
        return maior;
    }

    public double metragemTotal(List<Comodo> comodo){
        double metragem = comodo
                .stream()
                .mapToDouble(c ->c.getComprimento() * c.getLargura())
                .sum();
        return metragem;
    }

    public List<Metragem> metragemPorComodo(List<Comodo>comodo){

          List<Metragem> testando = new ArrayList<>();
          for(Comodo c : comodo){
              Metragem metragemPorComodo = new Metragem();
              metragemPorComodo.setNome(c.getNome());
              metragemPorComodo.setMetragem(c.getLargura()* c.getComprimento());
              testando.add(metragemPorComodo);
          }
        return testando;
    }

}

