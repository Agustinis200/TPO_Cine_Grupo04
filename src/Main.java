public class Main {
    public static void main(String[] args) {

        //Peliculas
        Pelicula elExorcista = new Pelicula("El Exorcista", TipoGenero.TERROR);
        Pelicula elGrinch = new Pelicula("El Grinch", TipoGenero.NAVIDENA);
        Pelicula saw = new Pelicula("SAW", TipoGenero.TERROR);
        Pelicula elSenorDeLosAnillos= new Pelicula("El Señor de los Anillos", TipoGenero.FANTASIA);
        Pelicula harryPotter = new Pelicula("Harry Potter", TipoGenero.FANTASIA);
        System.out.println(elExorcista.sosFestiva());
        System.out.println(elGrinch.sosFestiva());
        System.out.println();

        //Salas
        Sala sala1 = new Sala(26, true,34);
        Sala sala2 = new Sala(0, true,50); // No usable (sin capacidad)
        Sala sala3 = new Sala(50, false,12); // No usable (no en funcionamiento)
        Sala sala4 = new Sala(34, true,42);
        Sala sala5 = new Sala(56, true,23);
        System.out.println(sala1.esUsable());
        System.out.println(sala2.esUsable());
        System.out.println(sala3.esUsable());
        System.out.println();

        //Imprimir lista de Peliculas
        SistemaDePeliculas.mostrarPeliculas();
        System.out.println();

        //Clientes
        Cliente juan = new Cliente(false);
        Cliente pedro = new Cliente(true);

        //Entradas
        Entrada2D entradaElExorcista2D = new Entrada2D(elExorcista,sala1);
        Entrada3D entradaElGrinch3D = new Entrada3D(elGrinch,sala4);
        Entrada2D entradaSAW2D = new Entrada2D(saw,sala3);
        Entrada3D entradaElSenorDeLosAnillos3D = new Entrada3D(elSenorDeLosAnillos,sala2);
        Entrada2D entradaHarryPotter2D = new Entrada2D(harryPotter,sala5);

        //Calcular Precios por Cliente
        System.out.println(entradaElExorcista2D.calcularPrecio(juan)); // 5000
        System.out.println(entradaElGrinch3D.calcularPrecio(juan)); // 3000
        System.out.println(entradaElExorcista2D.calcularPrecio(pedro)); // 4500
        System.out.println(entradaElGrinch3D.calcularPrecio(pedro)); // 2700
        System.out.println();

        //Compra de Entradas
        juan.comprarEntrada(entradaElGrinch3D);
        juan.comprarEntrada(entradaElExorcista2D);
        juan.comprarEntrada(entradaSAW2D);
        juan.comprarEntrada(entradaElSenorDeLosAnillos3D);
        juan.comprarEntrada(entradaHarryPotter2D);

        //Imprimir Compras
        System.out.println(juan.getCompras());
        System.out.println(juan.esSocio());
        System.out.println();

        //Mostrar Informacion
        System.out.println(elExorcista.mostrarInformacion());
        System.out.println(entradaElExorcista2D.mostrarInformacion());
        System.out.println(elSenorDeLosAnillos.mostrarInformacion());
        System.out.println(entradaElSenorDeLosAnillos3D.mostrarInformacion());
        System.out.println(elGrinch.mostrarInformacion());
        System.out.println(entradaElGrinch3D.mostrarInformacion());
    }
}