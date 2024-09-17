package repository;

import model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}