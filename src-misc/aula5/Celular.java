package aula5;

public class Celular implements Precedente<Celular>{
    Integer number;
    String holder;

//    @Override
//    public int precedeA(Celular celular) {
//            if (this.number < celular.number){
//                return 1;
//            } else if(this.number > celular.number){
//                return -1;
//            };
//        return 0;
//    }

    @Override
    public int precedeA(Celular celular) {
        return celular.getNumber().compareTo(this.number);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }
}
