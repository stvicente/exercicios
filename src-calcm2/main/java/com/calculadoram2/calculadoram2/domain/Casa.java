package com.calculadoram2.calculadoram2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Casa {
    public String nome;
    public String endereco;
    public List<Comodo> comodo;
}
