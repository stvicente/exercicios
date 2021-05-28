package com.spring.calorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PratoDTO {
    public String nome;
    public List<IngredienteDTO> ingredientes;
}
