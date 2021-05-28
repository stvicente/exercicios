package com.spring.calorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredienteDTO {
    public String nome;
    public double gramas;
}
