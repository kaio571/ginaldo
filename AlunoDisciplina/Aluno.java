public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private double trabalho;

    public Aluno(String nome, String matricula, double nota1, double nota2, double trabalho) {
        super(nome, matricula);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media() {
        return (nota1 * 2.5 + nota2 * 2.5 + trabalho * 2) / 7;
    }

    public double notaFinal() {
        double m = media();
        if (m >= 7) {
            return 0;
        } else {
            return 10 - m; // precisa alcançar 10 com a soma da final
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Média: " + media() + ", Nota para Final: " + notaFinal();
    }
}
