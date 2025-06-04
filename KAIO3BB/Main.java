public class Main {
    public static void main(String[] args) {
        Pessoa aluno1 = new Aluno("Maria Silva", 14, "8º Ano");
        Pessoa professor1 = new Professor("João Lima", 35, "Matemática");

        aluno1.exibirInformacoes();      // Saída: Aluno: Maria Silva, Idade: 14, Turma: 8º Ano
        professor1.exibirInformacoes();  // Saída: Professor: João Lima, Idade: 35, Disciplina: Matemática
    }
}