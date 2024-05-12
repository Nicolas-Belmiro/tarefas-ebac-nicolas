public class Produto {

        private String marca;
        private String nome;
        private double quantidade;

        public Produto(String marca, String nome, double quantidade) {
            this.marca = marca;
            this.nome = nome;
            this.quantidade = quantidade;
        }


    public String getMarca() {
            return marca;
        }

        public String getNome() {
            return nome;
        }

        public double getQuantidade() {
            return quantidade;
        }
    }
