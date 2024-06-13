import dao.ContratoDao;
import dao.Mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoDao;
import service.IContratoService;

public class ContraroSeviceTest {

    @Test
    public void salvarContratoTest() {
        //IContratoDao dao = new ContratoDao();
        IContratoDao dao = (IContratoDao) new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO : TAREFA
    //Fazer métodos de : buscar, excluir, atualizar

    @Test
    public void buscarContratoTest() {
        IContratoDao dao = (IContratoDao) new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso na busqueda", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso na busqueda", retorno);
    }

    @Test
    public void excluirContratoTest() {
        IContratoDao dao = (IContratoDao) new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso na exclussão", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso na exclussão", retorno);
    }

    @Test
    public void atualizarContratoTest() {
        IContratoDao dao = (IContratoDao) new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso na atualização", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso na atualização", retorno);
    }
}