package com.example.diploma.diploma.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Diploma {
    public String mensagem;
    public Aluno aluno;
    public double media;

    public Diploma() {

    }
}
