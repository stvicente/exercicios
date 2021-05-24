package oop;

public class Disciplina {
    private String none;
    private double cargahoraria;

    public Disciplina(String none, double cargahoraria) {
        this.none = none;
        this.cargahoraria = cargahoraria;
    }

    public String getNone() {
        return none;
    }

    public double getCargahoraria() {
        return cargahoraria;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public void setCargahoraria(double cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "none='" + none + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
