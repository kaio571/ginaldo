public class Aluno extends Pessoa {
    private String turma;

    public Aluno(String nome, int idade, String turma) {
        super(nome, idade);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno: " + getNome() + ", Idade: " + getIdade() + ", Turma: " + turma);
    }
}