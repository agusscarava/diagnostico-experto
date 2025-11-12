public class Diagnostico {
    private String id;
    private String descripcion;
    private int peso;

    public Diagnostico(String id, String descripcion, int peso) {
        this.id = id;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public int getPeso() { return peso; }

    @Override
    public String toString() {
        return descripcion + " (prioridad " + peso + ")";
    }
}
