import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaFilter {
    public static void main(String[] args) {
        // Criando a lista de Produtos de compra
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Proteina("Picanha", 2, "Friboy"));
        listaProdutos.add(new Proteina("File de Frango", 3, "Ceara"));

        listaProdutos.add(new Laticinios("Queijo", 2, "queijo de minas"));
        listaProdutos.add(new Laticinios("Leite", 4, "moomoo"));

        listaProdutos.add(new Graos("Soja", 2, "Ceva Bom"));
        listaProdutos.add(new Graos("Feijao", 3, "Carioquinha"));

        // Utilizando a expressão lambda com o método filter para criar uma sublista
        double pedidoMinimo = 1;
        List<Produto> sublistaProdutos = listaProdutos.stream()
                .filter(produto -> produto.getQuantidade() > pedidoMinimo)
                .collect(Collectors.toList());

        // Exibindo a sublista resultante
        System.out.println("Novos produtos ! Qunatidade  " + pedidoMinimo + ":");
        for (Produto produto : sublistaProdutos) {
            if (produto instanceof Proteina) {
                Proteina proteina = (Proteina) produto;
                System.out.println("Marca: " + proteina.getMarca() + ", Nome: " + proteina.getNome() + ", Quantidade: " + proteina.getQuantidade() + ", Tipo: " + proteina.getTipo());
            } else if (produto instanceof Laticinios) {
                Laticinios laticinios = (Laticinios) produto;
                System.out.println("Marca: " + laticinios.getMarca() + ", Nome: " + laticinios.getNome() + ", Quantidade: " + laticinios.getQuantidade() + ", Tipo: " + laticinios.getTipo());
            } else if (produto instanceof Graos) {
                Graos graos = (Graos) produto;
                System.out.println("Marca: " + graos.getMarca() + ", Nome: " + graos.getNome() + ", Quantidade: " + graos.getQuantidade() + ", Tipo: " + graos.getTipo());
            } else {
                System.out.println("Marca: " + produto.getMarca() + ", Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade());
            }
        }
    }
}