public class Main {
    public static void main(String[] args) {

        //Peliculas
        Pelicula elExorcista = new Pelicula("El Exorcista", TipoGenero.TERROR);
        Pelicula elGrinch = new Pelicula("El Grinch", TipoGenero.NAVIDENA);
        Pelicula saw = new Pelicula("SAW", TipoGenero.TERROR);
        Pelicula senorDeLosAnillos= new Pelicula("El Señor de los Anillos", TipoGenero.FANTASIA);
        Pelicula harryPotter = new Pelicula("Harry Potter", TipoGenero.FANTASIA);
        System.out.println(elExorcista.sosFestiva());
        System.out.println(elGrinch.sosFestiva());
        System.out.println();

        //Imprimir lista de Peliculas
        SistemaDePeliculas.mostrarPeliculas();
        System.out.println();

        //Clientes
        Cliente juan = new Cliente(false);
        Cliente pedro = new Cliente(true);

        //Entradas
        Entrada2D entradaElExorcista2D = new Entrada2D(elExorcista);
        Entrada3D entradaElGrinch3D = new Entrada3D(elGrinch);
        Entrada2D entradaSAW2D = new Entrada2D(saw);
        Entrada3D entradaSenorDeLosAnillos3D = new Entrada3D(senorDeLosAnillos);
        Entrada2D entradaHarryPotter2D = new Entrada2D(harryPotter);

        //Calcular Precios por Cliente
        System.out.println(entradaElExorcista2D.calcularPrecio(juan)); // 5000
        System.out.println(entradaElGrinch3D.calcularPrecio(juan)); // 6000
        System.out.println(entradaElExorcista2D.calcularPrecio(pedro)); // 4500
        System.out.println(entradaElGrinch3D.calcularPrecio(pedro)); // 5400
        System.out.println();

        //Compra de Entradas
        juan.comprarEntrada(entradaElGrinch3D);
        juan.comprarEntrada(entradaElExorcista2D);
        juan.comprarEntrada(entradaSAW2D);
        juan.comprarEntrada(entradaSenorDeLosAnillos3D);
        juan.comprarEntrada(entradaHarryPotter2D);

        //Imprimir Compras
        System.out.println(juan.getCompras());
        System.out.println(juan.esSocio());

    }
}