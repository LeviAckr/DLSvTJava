import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
