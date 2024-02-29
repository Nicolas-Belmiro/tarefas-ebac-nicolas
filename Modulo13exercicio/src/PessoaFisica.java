public class PessoaFisica {

    private String nome ;

    private Long  cpf ;

    private Long idade ;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf)
    {
        this. cpf =cpf ;
    }

    public Long getIdade()
    {
        return idade;
    }

    public void setIdade(Long idade)
    {
        this.idade = idade;
    }

    public PessoaFisica() {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}
