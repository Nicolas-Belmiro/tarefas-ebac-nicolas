import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // Obter a classe da Pessoa
        Class<?> classePessoa = Pessoa.class;

        // Verificar se a anotação Tabela está presente
        if (classePessoa.isAnnotationPresent(ITabela.class)) {
            // Obter a instância da anotação Tabela
            ITabela tabelaAnnotation = classePessoa.getAnnotation(ITabela.class);

            // Imprimir o nome da tabela
            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Pessoa.");
        }
    }
}