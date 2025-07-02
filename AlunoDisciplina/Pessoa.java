public class Pessoa {
    protected String nome;
    protected String matricula;

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula;
    }
}
