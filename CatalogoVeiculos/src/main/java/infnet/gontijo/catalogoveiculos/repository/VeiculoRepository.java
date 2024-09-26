package infnet.gontijo.catalogoveiculos.repository;

import infnet.gontijo.catalogoveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
