package analisepratica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRoupa g1 = new GuardaRoupa();

        List<Vestuario> l1 = new ArrayList<>();
        List<Vestuario> l2 = new ArrayList<>();

        Vestuario v1 = new Vestuario("levis", "jeans");
        Vestuario v2 = new Vestuario("gucci", "vestido");
        Vestuario v3 = new Vestuario("louis", "bolsa");

        l1.add(v1);
        l1.add(v2);

        g1.guardarVestuarios(l1);
        g1.mostrarVestuarios();

        l2.add(v3);

        g1.guardarVestuarios(l2);
        g1.mostrarVestuarios();
        g1.devolverVestuarios(1);
    }
}
