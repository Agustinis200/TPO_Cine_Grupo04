public class Pelicula {

    private String titulo;
    private TipoGenero genero;

    public Pelicula(String titulo, TipoGenero genero) {
        this.titulo = titulo;
        this.genero = genero;
        SistemaDePeliculas.agregarPelicula(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean sosFestiva() {
        return genero.equals(TipoGenero.NAVIDENA);
    }
}
