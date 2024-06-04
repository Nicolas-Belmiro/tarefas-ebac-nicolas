import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ListaNomes> listaNomes = Arrays.asList(
                new ListaNomes("Fernanda ", " Mulher "),
                new ListaNomes("Cezar ", " Homen "),
                new ListaNomes("Junior ", " Homen "),
                new ListaNomes("Marcio ", " Homen "),
                new ListaNomes("Nicolas ", " Homen "),
                new ListaNomes("Yan Lucas ", " Homen "),
                new ListaNomes("Paula ", " Mulher "),
                new ListaNomes("Hilda  ", " Mulher "),
                new ListaNomes("Simone ", " Mulher "),
                new ListaNomes("Marceline ", " Mulher ")
        );

//filtrar apenas nomes de mulher na lista
        List<ListaNomes> Mulheres = listaNomes.stream()
                .filter(ListaNomes -> ListaNomes.getGenero().equalsIgnoreCase(" Mulher "))
                .collect(Collectors.toList());
// imprimir lista
        // Imprimir a lista de mulheres
        System.out.println("Lista com Nomes de  Mulheres:");
        Mulheres.forEach(listaNome -> System.out.println(listaNome.getNome()));


    }

    public static List<ListaNomes> testeFiltrarNomesDeMulheres(List<ListaNomes> listaNomes) {
        return listaNomes;
    }
}
