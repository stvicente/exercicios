package com.example.diploma.diploma.service;

import com.example.diploma.diploma.domain.Aluno;
import com.example.diploma.diploma.domain.Diploma;
import org.springframework.stereotype.Service;

@Service
public class DiplomaService {
    private static Aluno aluno;

    public Diploma showDiploma(Aluno aluno) {
        Diploma diploma = new Diploma();
        diploma.setAluno(aluno);
        double media = aluno.disciplinas
                                .stream()
                                .mapToDouble(disciplina -> disciplina.nota)
                                .average()
                                .getAsDouble();
        diploma.setMedia(media);
        diploma.setMensagem(media >= 9. ? "Parabéns" : "Esforça-te!");
        return diploma;
    }
}
