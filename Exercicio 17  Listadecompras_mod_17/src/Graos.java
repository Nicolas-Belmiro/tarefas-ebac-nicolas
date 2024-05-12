public class Graos  extends Produto {
    private String tipo;

    public Graos(String nome, double quantidade, String tipo) {
        super("Graos", nome, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

