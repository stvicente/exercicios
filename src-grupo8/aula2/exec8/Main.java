package aula2.exec8;

public class Main {

    public static void main(String[] args) throws Exception {

        WeakPassword senha = new WeakPassword("abeaweawaew");
        System.out.println(senha);
        MediumPassword senha2 = new MediumPassword("1ASjkdjs34");
        System.out.println(senha2);
        StrongPassword senha3 = new StrongPassword("dasasd567!#");
        System.out.println(senha3);
    }
}
