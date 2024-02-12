public class PessoaJuridica {

    private String nome ;

    private Long  cnpj ;

    private Long idade ;

    public String getNome()
    {        return nome;
    }

    public void setNome(String nome)
    {        this.nome = nome;
    }

    public Long getCpf()
    {        return cnpj;
    }

    public void setCpf(Long cnpj)
    {        this.cnpj = cnpj;
    }

    public Long getIdade()
    {        return idade;
    }

    public void setIdade(Long idade)
    {
        this.idade = idade;
    }
}
