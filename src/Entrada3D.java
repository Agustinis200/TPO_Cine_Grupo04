public class Entrada3D extends Entrada{

    private float precioAdicional = 1000;

    public Entrada3D(Pelicula unaPelicula) {
        super(unaPelicula);
    }

    @Override
    public float calcularPrecio(Cliente unCliente) {
        if (unCliente.esSocio() && getPelicula().sosFestiva()) {
            return (precioBase + precioAdicional) * (float)0.9 * (float)0.5;
        } else if (unCliente.esSocio()) {
            return (precioBase + precioAdicional) * (float)0.9;
        } else if (getPelicula().sosFestiva()) {
            return (precioBase + precioAdicional) * (float)0.5;
        } else {
            return precioBase + precioAdicional;
        }
    }

    @Override
    public String mostrarInformacion() {
        // Llamar a calcularPrecio() para obtener el precio calculado y mostrar la info
        float precioFinal = calcularPrecio(new Cliente(false)); // Pasa un cliente para el cálculo
        float precioFinalParaSocio = calcularPrecio(new Cliente(true)); // Pasa un cliente para el cálculo
        return "Entrada 3D para: " + getPelicula().getTitulo() + ", Precio: " + precioFinal + ", Precio para Socios: " + precioFinalParaSocio;
    }
}
