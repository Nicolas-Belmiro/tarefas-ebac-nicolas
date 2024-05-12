public class Proteina  extends Produto {
        private String tipo;

        public Proteina(String nome, double quantidade, String tipo) {
            super("Proteina", nome, quantidade);
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }





    }

