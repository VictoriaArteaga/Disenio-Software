public abstract class Publicacion {

    private String titulo;
    private double precio;


    public Publicacion() {}

    public Publicacion(String titulo, double precio) {

        this.titulo = titulo;
        setPrecio(precio);

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo( String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {

        if (precio > 0 ) {
            this.precio = precio;
        }

        else {
            throw new IllegalArgumentException("EL precio debe ser mayor a 0.");
        }
    }

    @Override
    public String toString() {
        return "La publicación con titulo: " + this.titulo + "\n" +
                "tiene precio: " + this.precio;
    }
}
