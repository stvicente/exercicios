package com.spring.calorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaloriasDTO {
    public String nome;
    public double calorias;

    public CaloriasDTO() {

    }
}
