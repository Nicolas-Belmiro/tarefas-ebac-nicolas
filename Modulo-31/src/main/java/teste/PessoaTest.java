package teste;

import domain.Pessoa;
import org.junit.Test;

public class PessoaTest {



    @Test
    public void cadastrar() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rodrigo");
        pessoa.addApelido("Rodrigão");
        //pessoaDao.cadastrar(pessoa);
    }
}