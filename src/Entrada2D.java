public class Entrada2D extends Entrada {

    public Entrada2D(Pelicula unaPelicula, Sala unaSala) {
        super(unaPelicula, unaSala);
    }

    @Override
    public float calcularPrecio(Cliente unCliente) {
        if (unCliente.esSocio() && getPelicula().sosFestiva()) {
            return precioBase * (float)0.9 * (float)0.5;
        } else if (unCliente.esSocio()) {
            return precioBase * (float)0.9;
        } else if (getPelicula().sosFestiva()) {
            return precioBase * (float)0.5;
        } else {
            return precioBase;
        }
    }

    @Override
    public String mostrarInformacion() {
        // Llamar a calcularPrecio() para obtener el precio calculado y mostrar la info
        float precioFinal = calcularPrecio(new Cliente(false)); // Pasa un cliente para el cálculo
        float precioFinalParaSocio = calcularPrecio(new Cliente(true)); // Pasa un cliente para el cálculo
        return "Entrada 2D para: " + getPelicula().getTitulo() + ", Sala: " + getSala().getNumeroDeSala() + ", Precio: " + precioFinal + ", Precio para Socios: " + precioFinalParaSocio;
    }
}
