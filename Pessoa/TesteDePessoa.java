package Pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mic");
        pessoa.setIdade(22);

        Professor professor = new Professor();
        professor.setIdade(44);
        professor.setNome("Seila");
        professor.setSalario(5000);

        Aluno aluno = new Aluno();
        aluno.setIdade(18);
        aluno.setNome("Seinao");
        aluno.setMatricula("33333");


        System.out.println(professor.imprimirDadosDaPessoa());
        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
