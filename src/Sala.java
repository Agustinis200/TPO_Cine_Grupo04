public class Sala {

    private int numeroDeSala;
    private int capacidad;
    private boolean enFuncionamiento;

    public Sala(int capacidad, boolean enFuncionamiento, int numeroDeSala) {
        this.capacidad = capacidad;
        this.enFuncionamiento = enFuncionamiento;
        this.numeroDeSala = numeroDeSala;
    }

    public int getNumeroDeSala() {
        return numeroDeSala;
    }

    public boolean esUsable() {
        return enFuncionamiento && capacidad > 0;
    }
}
