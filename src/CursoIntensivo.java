public class CursoIntensivo extends Curso {
    private String cronograma;

    public CursoIntensivo() {
        super("Curso Intensivo");
    }

    @Override
    public double calculoCertificado() {
        return this.getCargaHoraria() * 1.5;
    }
}