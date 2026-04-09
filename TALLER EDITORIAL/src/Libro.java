
public class Libro extends Publicacion{

    private int numeroPaginas;
    private int anioPublicacion;

    public Libro() {}

    public Libro(int numeroPaginas, int anioPublicacion) {

        setNumeroPaginas(numeroPaginas);
        setAnioPublicacion(anioPublicacion);
    }

    public Libro(int numeroPaginas, int anioPublicacion,
                 String titulo, double precio) {

        super(titulo, precio);
        setNumeroPaginas(numeroPaginas);
        setAnioPublicacion(anioPublicacion);
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {

        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        }
        else {
            throw  new IllegalArgumentException("EL número de páginas debe ser mayor que 0.");
        }
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {

        final int ANIO_ACTUAL = java.time.Year.now().getValue();

        if (anioPublicacion > 0 && anioPublicacion <= ANIO_ACTUAL) {
            this.anioPublicacion = anioPublicacion;
        }

        else {
            throw new IllegalArgumentException("El año de publicación debe estar en el rango de 0 y año actual.");
        }
    }

    @Override
    public String toString() {
        return "Libro: " + getTitulo() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Número de páginas: " + this.numeroPaginas + "\n" +
                "Año de publicación: " + this.anioPublicacion + "\n";
    }
}
