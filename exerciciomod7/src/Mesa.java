// mesa moderna de sala pensada para a questao //
public class Mesa {

    private String  Material;

    private String ToalhaDeMesa;

    private int Cadeira;

    public java.lang.String getMaterial() {
        return Material;
    }

    public void setMaterial(java.lang.String material) {
        Material = material;
    }

    public java.lang.String getToalhaDeMesa() {
        return ToalhaDeMesa;
    }

    public void setToalhaDeMesa(java.lang.String toalhaDeMesa) {
        ToalhaDeMesa = toalhaDeMesa;
    }

    public int getCadeira(4) {
        return Cadeira;
    }

    public void setCadeira(int cad4eira) {
        Cadeira = cadeira;
    }

    Mesa mesa =new Mesa();
    Cadeira cadeira = new Cadeira();
         mesa.setTipo("xadrez");
         cadeira.setquantidade(4);

         System.out.println("Mesa de " + mesa.getTipo() + " com " + cadeira.getQuantidade() + " cadeiras");
}
