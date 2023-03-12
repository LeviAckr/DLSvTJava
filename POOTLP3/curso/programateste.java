import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do Professor
        Professor professor = new Professor("João Silva", "Ciências da Computação", "joao.silva@exemplo.com");

        // Criação do Curso
        Curso curso = new Curso("Programação Java", "Segunda-feira, 19h-22h", professor);

        // Criação dos Alunos
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entre com o nome do aluno " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Entre com a matrícula do aluno " + i + ":");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula);
            curso.adicionarAluno(aluno);

            for (int j = 1; j <= 4; j++) {
                System.out.println("Entre com a nota " + j + " do aluno " + i + ":");
                double nota = scanner.nextDouble();
                scanner.nextLine();

                aluno.setNota(j - 1, nota);
            }
        }

        // Impressão das Médias dos Alunos
        for (Aluno aluno : curso.getAlunos()) {
            System.out.println("
