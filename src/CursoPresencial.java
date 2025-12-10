public class CursoPresencial extends Curso {
    private int sala;

    public CursoPresencial() {
        super("Curso Presencial");
    }

    @Override
    public double calculoCertificado() {
        return this.getCargaHoraria() * 1.2;
    }
}