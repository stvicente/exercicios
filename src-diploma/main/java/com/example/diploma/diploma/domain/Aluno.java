package com.example.diploma.diploma.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Aluno {
    public String nome;
    public List<Disciplina> disciplinas;
}
