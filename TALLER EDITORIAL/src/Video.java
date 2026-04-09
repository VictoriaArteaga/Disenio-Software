public class Video extends Publicacion{

    private TipoIdioma idioma;
    private double duracionHoras;

    public Video() {}

    public Video( TipoIdioma idioma, double duracionHoras) {
        this.idioma = idioma;
        setDuracionHoras(duracionHoras);
    }

    public Video( TipoIdioma idioma, double duracionHoras,
                  String titulo, double precio) {

        super(titulo, precio);
        this.idioma = idioma;
        setDuracionHoras(duracionHoras);

    }

    public TipoIdioma getIdioma() {
        return this.idioma;
    }

    public void setIdioma(TipoIdioma idioma) {
        this.idioma = idioma;
    }

    public double getDuracionHoras() {
        return this.duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {

        if (duracionHoras > 0) {
            this.duracionHoras = duracionHoras;
        }

        throw new IllegalArgumentException("La duración del video debe ser mayor a 0.");
    }

    @Override
    public String toString() {
        return "Video: " + getTitulo() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Idioma: " + this.idioma + "\n" +
                "Duración en horas: " + this.duracionHoras;
    }

}
