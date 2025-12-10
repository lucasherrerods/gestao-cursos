import java.util.ArrayList;

public abstract class Curso {
    private String nome;
    private double cargaHoraria;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    @Override
    public String toString() {
        String professorAtual = getProfessor().getNome();

        return "{ tipo='" + getNome() +
                "', cargaHoraria=" + getCargaHoraria() +
                ", professor='" + professorAtual +
                "', alunos=" + alunos.size() + " }";
    }

    public abstract double calculoCertificado();

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getNome() {
        return this.nome;
    }

    public double getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
}