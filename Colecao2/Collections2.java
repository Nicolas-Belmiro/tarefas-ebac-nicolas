import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Collections2 {

    public static void main(String args[]) {
        // Criar a lista para armazenar os nomes
        List<String> nomesFamiliares = new ArrayList<>();

        // Criar um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Loop para adicionar nomes
        while (true) {
            // Ler o nome do familiar do usuário
            System.out.println("Digite o nome do familiar acompanhado do genero (exemplo: Eduardo-M)   (ou digite 'sair' para finalizar):");
            String nome = scanner.next();

            // Sair do loop se o usuário digitar "sair"
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            // Adicionar o nome à lista
            nomesFamiliares.add(nome);
        }

        // Fechar o objeto Scanner
        scanner.close();

        // Exibir a lista de nomes
        System.out.println("\nLista de Familiares:");
        for (String nome : nomesFamiliares) {
            System.out.println(" - " + nome);
        }


        List<String> listaFeminino = new ArrayList<>();
        List<String> listaMasculino = new ArrayList<>();

        for (String pessoa : nomesFamiliares) {

            String[] splited = pessoa.split("-"); // Separando nome e genero de cada pessoa da lista
            String nome = splited[0]; // Pegando o nome da pessoa
            String genero = splited[1]; // Pegando o genero da pessoa

            if (genero.equals("M")) {
                listaMasculino.add(nome);
            } else if (genero.equals("F")) {
                listaFeminino.add(nome);
            } else {
                System.out.println("Nome ou Genero Inválidos !");
            }
        }


        // Exibir a lista de Masculinos
        System.out.println("\nLista de Masculinos:");
        for (String i : listaMasculino) {
            System.out.println(i);
        }

        // Exibir a lista de Femininos
        System.out.println("\nLista de Feminino:");
        for (String i : listaFeminino) {
            System.out.println(i);
        }

    }
}