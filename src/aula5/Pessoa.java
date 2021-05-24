package aula5;

public class Pessoa implements Precedente<Pessoa>{
        String nome;
        String cpf;

    @Override
    public int precedeA(Pessoa pessoa) {
        for(int i =0; i < this.nome.length(); i++){
            if (this.nome.charAt(i) < pessoa.nome.charAt(i)){
                return 1;
            } else if(this.nome.charAt(i) > pessoa.nome.charAt(i)){
                return -1;
            };
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String CPF) {
        this.cpf = CPF;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
