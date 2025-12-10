public class Professor extends Pessoa {
    private String especialidade;
    private int id;
    private static int count = 1;

    public Professor() {
        this.id = count;
        this.especialidade = null;
        Professor.count += 1;
    }

    @Override
    public String toString() {
        return "{ id=" + getId() +
                ", nome='" + getNome() +
                "', especialidade='" + getEspecialidade() + "' }";
    }

    public int getId() {
        return this.id;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}