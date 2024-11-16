public class Entrada3D extends Entrada{

    private float precioAdicional = 1000;

    public Entrada3D(Pelicula unaPelicula) {
        super(unaPelicula);
    }

    @Override
    public float calcularPrecio(Cliente unCliente) {
        if (unCliente.esSocio()) {
            return (precioBase + precioAdicional) * (float) 0.9;

        } else {
            return precioBase + precioAdicional;
        }
    }
}
