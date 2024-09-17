package repository;

import model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}