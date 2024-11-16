public abstract class Entrada {

    protected float precioBase = 5000;
    private Pelicula unaPelicula;

    public Entrada(Pelicula unaPelicula) {
        this.unaPelicula = unaPelicula;
    }

    public abstract float calcularPrecio(Cliente unCliente);
}

