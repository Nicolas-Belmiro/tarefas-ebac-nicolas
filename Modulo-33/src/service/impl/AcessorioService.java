package impl;


import model.Acessorio;
import model.Carro;
import repository.AcessorioRepository;

import java.util.List;

@Service
public class AcessorioService implements ICrud<Acessorio, Long, Carro> {
    private final AcessorioRepository repository;

    public AcessorioService(AcessorioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Acessorio> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Acessorio findById(Long id) {
        return repository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public Acessorio save(Acessorio acessorio) {
        return repository.save(acessorio);
    }

    @Override
    public void delete(Long id) {
        var acessorio = this.findById(id);
        repository.delete(acessorio);
    }

    @Override
    public Acessorio add(Long id, Carro carro) {
        var acessorio = this.findById(id);
        acessorio.addCarro(carro);
        return repository.save(acessorio);
    }

    @Override
    public Acessorio remove(Long id, Carro carro) {
        var acessorio = this.findById(id);
        acessorio.removeCarro(carro);
        return repository.save(acessorio);
    }

}
