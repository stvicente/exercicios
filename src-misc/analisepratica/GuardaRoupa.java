package analisepratica;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private static Integer contador = 0;
    private Map<Integer, List<Vestuario>> pecas = new HashMap<>();

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        contador++;
        this.pecas.put(contador, listaDeVestuario);
        return contador;
    }

    public void mostrarVestuarios(){
        System.out.println(this.getPecas());
    }

    public List<Vestuario> devolverVestuarios(Integer id){
//        this.pecas.remove(id);
        System.out.println(this.pecas.get(id));
        return this.pecas.get(id);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Map<Integer, List<Vestuario>> getPecas() {
        return pecas;
    }

    public void setPecas(HashMap pecas) {
        this.pecas = pecas;
    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "contador=" + contador +
                ", pecas=" + pecas +
                '}';
    }
}
