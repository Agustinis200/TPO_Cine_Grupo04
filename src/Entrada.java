public abstract class Entrada implements Visualizable{

    protected float precioBase = 5000;
    private Pelicula unaPelicula;
    private Sala unaSala;

    public Entrada(Pelicula unaPelicula, Sala unaSala) {
        this.unaPelicula = unaPelicula;
        this.unaSala = unaSala;
    }

    public Pelicula getPelicula() {
        return unaPelicula;
    }

    public Sala getSala() {
        return unaSala;
    }

    public abstract float calcularPrecio(Cliente unCliente);

    @Override
    public abstract String mostrarInformacion();
}

