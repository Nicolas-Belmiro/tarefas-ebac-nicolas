import org.junit.Assert;
import org.junit.Test;
import service.TesteCliente;

public class TesteClienteTeste{


        @Test
        public void testeClasseCliente() {
            TesteCliente cli = new TesteCliente();
            cli.setNome("Nicolas");
            Assert.assertEquals("Nicolas", cli.getNome());
        }
    }

