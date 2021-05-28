package com.calculadoram2.calculadoram2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Metragem {
    public String nome;
    public double metragem;

    public Metragem() {
    }
}