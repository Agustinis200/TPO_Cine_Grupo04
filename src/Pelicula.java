public class Pelicula implements Visualizable{

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

    @Override
    public String mostrarInformacion() {
        return "Pelicula: " + titulo + ", Genero: " + genero;
    }
}
