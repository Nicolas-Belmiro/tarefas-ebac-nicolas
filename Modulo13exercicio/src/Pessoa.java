import java.util.logging.LogManager;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = criarPessoaFisica("Nicolas", String.valueOf(12314L), 25L);
        PessoaJuridica pessoaJuridica = criarPessoaJuridica("Macio", String.valueOf(12314L), 25L);

        System.out.println("Pessoa física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Idade: " + pessoaFisica.getIdade());

        System.out.println("\nPessoa jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Idade: " + pessoaJuridica.getIdade());
    }

    private static PessoaFisica criarPessoaFisica(String nome, String cpf, Long idade) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome(nome);
        pessoaFisica.setCpf(Long.valueOf(cpf));
        pessoaFisica.setIdade(idade);
        return pessoaFisica;
    }

    private static PessoaJuridica criarPessoaJuridica(String nome, String cnpj, Long idade) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome(nome);
        pessoaJuridica.setCnpj(cnpj);
        pessoaJuridica.setIdade(idade);
        return pessoaJuridica;
    }
}

class pessoaFisica {

    private String nome;

    private String cpf;

    private Long idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

}

class pessoaJuridica {

    private String nome;

    private String cnpj;

    private Long idade;

    public String getNome() {

        return null;
    }

    public void setNome(String nome) {
    }

    public String getCnpj() {
        return null;
    }

    public void setCnpj(String cnpj) {
    }

    public String getIdade() {
        return null;
    }

    public void setIdade(Long idade) {
    }
}