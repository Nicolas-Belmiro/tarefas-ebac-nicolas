// mesa moderna de sala pensada para a questao //
public class Mesa {

    private String  Material;

    private String ToalhaDeMesa;



    void status(){ System.out.print("Uma Mesa"+ this.Material);

        System.out.println("Uma Mesa"+ this.ToalhaDeMesa);



    }
    public void setMaterial(java.lang.String material) {
        Material = material;
    }

    public void setToalhaDeMesa(java.lang.String toalhaDeMesa) {
        ToalhaDeMesa = toalhaDeMesa;
    }


}


