public class Laticinios extends Produto {

        private String tipo;

        public Laticinios(String nome, double quantidade, String tipo) {
            super("Laticinios", nome, quantidade);
            this.tipo = tipo;
        }


    public String getTipo() {
            return tipo;
        }
    }
