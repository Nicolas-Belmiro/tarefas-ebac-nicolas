import dao.ClienteDao;
import dao.IClienteDao;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

public class ClienteServiceTest {

     @Test
    public void salvarTeste(){
        ClienteService service = new ClienteService();
        String retorno = service.salvar();
         Assert.assertEquals("sucesso", retorno);

    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = (IClienteDao) new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
