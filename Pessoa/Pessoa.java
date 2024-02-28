package Pessoa;

public class Pessoa {
    // nome, idade, cpf
    //tipo nomeDaVariavel

    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    String imprimirDadosDaPessoa(){
        return  "O nome da pessoa é " + nome + "com a idade de " + idade;
    }
        
}
