import java.util.ArrayList;

public class Cliente {

    private boolean socio;
    private ArrayList<Entrada> compras;

    public Cliente(boolean socio) {
        this.socio = socio;
        compras = new ArrayList<>();
    }

    public ArrayList<Entrada> getCompras() {
        return compras;
    }

    public boolean esSocio() {
        return socio;
    }

    public void comprarEntrada(Entrada unaEntrada) {
        compras.add(unaEntrada);
        if (compras.size() >= 5) {
            socio = true;
        }
    }
}
