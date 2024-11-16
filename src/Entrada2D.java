public class Entrada2D extends Entrada{

    public Entrada2D(Pelicula unaPelicula) {
        super(unaPelicula);
    }

    @Override
    public float calcularPrecio(Cliente unCliente) {
        if (unCliente.esSocio()) {
            return precioBase * (float)0.9;
        } else {
            return precioBase;
        }
    }
}
