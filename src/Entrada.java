public abstract class Entrada implements Visualizable{

    protected float precioBase = 5000;

    private Pelicula unaPelicula;

    public Entrada(Pelicula unaPelicula) {
        this.unaPelicula = unaPelicula;
    }

    public Pelicula getPelicula() {
        return unaPelicula;
    }

    public abstract float calcularPrecio(Cliente unCliente);

    @Override
    public abstract String mostrarInformacion();
}

