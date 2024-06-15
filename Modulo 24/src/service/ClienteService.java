package service;

import dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao ;
    public ClienteService (){
       // clienteDao =  new ClienteDao();
        // clienteDao = new ClienteDaoMock();


    }

    public ClienteService(IClienteDao mockDao) {
    }

    public String salvar (){
        clienteDao.salvar();
        return  "sucesso";
    }

}
