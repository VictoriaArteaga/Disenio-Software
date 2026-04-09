public class Disco extends Publicacion{

    private double duracionMinutos;

    public Disco() {}

    public Disco( double duracionMinutos) {
        setDuracionMinutos(duracionMinutos);
    }

    public Disco( double duracionMinutos, String titulo, double precio) {
        super(titulo, precio);
        setDuracionMinutos(duracionMinutos);
    }

    public double getDuracionMinutos() {
        return this.duracionMinutos;
    }

    public void setDuracionMinutos(double duracionMinutos) {

        if (duracionMinutos > 0) {
            this.duracionMinutos = duracionMinutos;
        }

        throw new IllegalArgumentException("La duración debe ser mayor que 0.");
    }

    @Override
    public String toString() {
        return "Disco: " + getTitulo() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Duración en minutos: " + this.duracionMinutos;
    }
}
