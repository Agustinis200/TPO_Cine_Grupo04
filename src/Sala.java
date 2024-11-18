public class Sala {
    private int capacidad;
    private boolean enFuncionamiento;

    public Sala(int capacidad, boolean enFuncionamiento) {
        this.capacidad = capacidad;
        this.enFuncionamiento = enFuncionamiento;
    }

    public boolean esUsable() {
        return enFuncionamiento && capacidad > 0;
    }
}
