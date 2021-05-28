package oop;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String serie;
    private String codigo;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Estudante> estudantes = new ArrayList<>();

    public Turma(String serie, String codigo, List<Disciplina> disciplinas, List<Estudante> estudantes) {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public String getSerie() {
        return serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigo='" + codigo + '\'' +
                ", disciplinas=" + disciplinas +
                ", estudantes=" + estudantes +
                '}';
    }
}
