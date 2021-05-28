package oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("stefanie", 27, 20211234, "9");
        Estudante estudante2 = new Estudante("pandora", 7, 20211235, "7");

        Disciplina disciplina1 = new Disciplina("oop", 90);
        Disciplina disciplina2 = new Disciplina("eng", 70);
        Disciplina disciplina3 = new Disciplina("bd", 85.5);

        List<Estudante> estudantes = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

        estudantes.add(estudante1);
        estudantes.add(estudante2);

        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);

        Turma turma = new Turma("9", "A1", disciplinas, estudantes);

        System.out.println(turma);
    }
}
