import java.util.HashSet;

public class SistemaDePeliculas {

    private static HashSet<Pelicula> peliculas = new HashSet<>();

    public static void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public static void mostrarPeliculas() {
        for (Pelicula p : peliculas) {
            System.out.println(p.getTitulo());
        }
    }

}
