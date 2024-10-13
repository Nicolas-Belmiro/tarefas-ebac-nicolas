public class ClienteDaoJpa2 extends GenericDaoJpa2<ClienteJpa, Long> implements IClienteDaoJpa<ClienteJpa> {
    public ClienteDaoJpa2(){
        super(ClienteJpa.class);
    }
}