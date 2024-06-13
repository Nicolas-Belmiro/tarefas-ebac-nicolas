import org.junit.Assert;
import org.junit.Test;

public class TesteCliente {

    @Test
public void testeClasseCliente() {
    TesteCliente cli = new TesteCliente();
    cli.adicionarNome("Nicolas");
    cli.adicionarNome1("Nicolas");

    Assert.assertEquals(new String[]{"Nicolas"}, cli.getNome());
}

    private void adicionarNome1(String nicolas) {
    }

    private void adicionarNome(String nicolas) {
    }

    private Object[] getNome() {

        return new Object[0];
    }
}
