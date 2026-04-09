import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- REGISTRO DE LIBROS ----");

        // 1. LIBROS
        System.out.println("Ingrese el titulo del libro: ");
        String tituloLibro = sc.nextLine();

        System.out.println("Ingrese el precio del libro: ");
        double precioLibro = sc.nextDouble();

        System.out.println("Ingrese el número de páginas del libro: ");
        int numeroPaginas = sc.nextInt();

        System.out.println("Ingrese el año de publicación del libro: ");
        int anioPublicacion = sc.nextInt();

        sc.nextLine(); // Limpieza.

        Libro libro1 = new Libro(numeroPaginas, anioPublicacion, tituloLibro, precioLibro);
        System.out.println("Descripción detallada:");
        System.out.println(libro1);

        System.out.println("---- REGISTRO DE DISCOS ----");

        // 2. DISCOS
        System.out.println("Ingrese el titulo del disco: ");
        String tituloDisco = sc.nextLine();

        System.out.println("Ingrese el precio del disco: ");
        double precioDisco = sc.nextDouble();

        System.out.println("Ingrese la duración del disco (en minutos): ");
        double duracionMinutos = sc.nextDouble();

        sc.nextLine(); // Limpieza.

        Disco disco1 = new Disco(duracionMinutos, tituloDisco, precioDisco);
        System.out.println("Descripción detallada:");
        System.out.println(disco1);

        System.out.println("---- REGISTRO DE VIDEOS ----");

        // 3. VIDEOS
        System.out.println("Ingrese el titulo del video: ");
        String tituloVideo = sc.nextLine();

        System.out.println("Ingrese el precio del video: ");
        double precioVideo = sc.nextDouble();

        sc.nextLine(); // Limpieza.

        System.out.println("Ingrese el idioma del video (ESPANOL, INGLES, PORTUGUES): ");
        String idiomaTexto = sc.nextLine().trim().toUpperCase();

        TipoIdioma idioma = TipoIdioma.valueOf(idiomaTexto);

        System.out.println("Ingrese la duración del video (en horas): ");
        double duracionHoras = sc.nextDouble();

        sc.nextLine(); // Al final por buena práctica.

        Video video1 = new Video(idioma, duracionHoras, tituloVideo, precioVideo);
        System.out.println("Descripción detallada:");
        System.out.println(video1);

        sc.close();
    }
}