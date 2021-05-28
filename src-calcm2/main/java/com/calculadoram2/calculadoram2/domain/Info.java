package com.calculadoram2.calculadoram2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Info {
    public double metragemTotal;
    public double valor;
    public Comodo maiorComodo;
    public List<Metragem> metragemPorComodo;

    public Info() {

    }
}
