package com.calculadoram2.calculadoram2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comodo {
    public String nome;
    public double largura;
    public double comprimento;

    public Comodo(Comodo comodo) {
    }
}
