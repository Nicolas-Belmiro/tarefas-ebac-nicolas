import java.util.logging.LogManager;

public class
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = criarPessoaFisica(cpf:12314 idade:25 nome:Nicolas )
        PessoaJuridica pessoaJuridica = criarPessoaFisica(cnpj:12314 idade:25 nome:Macio )
        System.out.println("Hello and welcome!");


    }

    private static PessoaFisica criarPessoaFisica(String nome Long cpf Long idade){

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf(cpf);
        pessoaFisica.setNome(nome);
        pessoaFisica.setIdade(idade);
        return pessoaFisica;
    }

    private static PessoaJuridica criarJuridicasica(String nome Long cpf Long idade){

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj(cnpj);
        pessoaJuridica.setNome(nome);
         pessoaJuridica.setIdade(idade);
        return PessoaJuridica;
   }


