
public class ClienteDaoJpa3 extends GenericDaoJpa3<ClienteJpa, Long> implements IClienteDaoJpa<ClienteJpa> {
    public ClienteDaoJpa3(){
        super(ClienteJpa.class);
    }
}