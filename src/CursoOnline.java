public class CursoOnline extends Curso {
    private String link;

    public CursoOnline() {
        super("Curso Online");
    }

    @Override
    public double calculoCertificado() {
        return this.getCargaHoraria() * 1.0;
    }
}