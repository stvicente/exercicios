package com.spring.calorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CalculadoraDTO {
    public double caloriasTotais;
    public List<CaloriasDTO> caloriasPorIngrediente;
    public CaloriasDTO ingredienteMaisCalorico;

    public CalculadoraDTO() {

    }
}
