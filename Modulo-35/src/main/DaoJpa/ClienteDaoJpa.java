

public class ClienteDaoJpa extends GenericDaoJpa<ClienteJpa, Long> implements IClienteDaoJpa<C> {
    public ClienteDaoJpa(){
        super(ClienteJpa.class);
    }
}
