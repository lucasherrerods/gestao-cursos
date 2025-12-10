public class Aluno extends Pessoa {
    private static int count = 1;
    private int matricula;
    private String cursoMatriculado;

    public Aluno() {
        this.matricula = count;
        this.cursoMatriculado = null;
        Aluno.count += 1;
    }

    @Override
    public String toString() {
        return "{ matricula=" + getMatricula() +
                ", nome='" + getNome() +
                "', email='" + getEmail() +
                "', curso='" + getCursoMatriculado() + "' }";
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCursoMatriculado() {
        return this.cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
}