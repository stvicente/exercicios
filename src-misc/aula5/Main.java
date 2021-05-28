package aula5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        p1.nome = "Pandora";
        p2.nome = "Stefanie";
        p3.nome = "Romulo";
        System.out.println(p2.precedeA(p1));
        Pessoa[] pessoas = new Pessoa[]{p1, p2, p3};
        System.out.println(Arrays.toString(pessoas));
        System.out.println(Arrays.toString(SortUtil.sort(pessoas)));

        Celular c1 = new Celular();
        Celular c2 = new Celular();
        Celular c3 = new Celular();
        c1.number = 12345;
        c2.number = 200;
        c3.number = 5555;
        Celular[] celulares = new Celular[]{c1, c2, c3};
        System.out.println(Arrays.toString(celulares));
        System.out.println(Arrays.toString(SortUtil.sort(celulares)));

    }
}
