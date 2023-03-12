public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas = new double[4];

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNota(int indice, double valor) {
        notas[indice] = valor;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
}
