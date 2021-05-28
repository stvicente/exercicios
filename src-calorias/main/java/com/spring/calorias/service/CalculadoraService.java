package com.spring.calorias.service;

import com.spring.calorias.dto.CalculadoraDTO;
import com.spring.calorias.dto.CaloriasDTO;
import com.spring.calorias.dto.IngredienteDTO;
import com.spring.calorias.dto.PratoDTO;
import com.spring.calorias.repository.CaloriasRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculadoraService {
    private static CaloriasRepository caloriasRepository;

    public CalculadoraService(CaloriasRepository caloriasRepository){
        this.caloriasRepository = caloriasRepository;
    }

    public CalculadoraDTO calcule(PratoDTO prato){
        CalculadoraDTO calculadora = new CalculadoraDTO();
        calculadora.setCaloriasTotais(caloriasTotais(prato.ingredientes));
        calculadora.setCaloriasPorIngrediente(caloriasPorIngrediente(prato.ingredientes));
        calculadora.setIngredienteMaisCalorico(ingredienteMaisCalorico(prato.ingredientes));
        return calculadora;
    }

    private double caloriasTotais(List<IngredienteDTO> ingredientes){
        double caloriasTotais = ingredientes
                                .stream()
                                .mapToDouble(i -> caloriasRepository.findCaloriasByIngredient(i.nome).getCalorias())
                                .sum();
        return caloriasTotais;
    }

    private CaloriasDTO ingredienteMaisCalorico(List<IngredienteDTO> ingredientes){
        List<CaloriasDTO> calorias = caloriasPorIngrediente(ingredientes);
        CaloriasDTO maisCalorico = calorias
                                        .stream()
                                        .max(Comparator.comparing(c -> c.calorias))
                                        .get();
        return maisCalorico;
    }

    private List<CaloriasDTO> caloriasPorIngrediente(List<IngredienteDTO> ingredientes) {
        List<CaloriasDTO> calorias = new ArrayList<>();
        for(IngredienteDTO i : ingredientes){
            CaloriasDTO caloriasPorIngrediente = new CaloriasDTO();
            double caloriasValor = caloriasRepository.findCaloriasByIngredient(i.nome).getCalorias();
            caloriasPorIngrediente.setNome(i.getNome());
            caloriasPorIngrediente.setCalorias(caloriasValor * i.getGramas());
            calorias.add(caloriasPorIngrediente);
        }
        return calorias;
    }
}
