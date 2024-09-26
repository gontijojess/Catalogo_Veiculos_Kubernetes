package infnet.gontijo.catalogoveiculos.service;

import infnet.gontijo.catalogoveiculos.model.Veiculo;
import infnet.gontijo.catalogoveiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> findById(long id) {
        return veiculoRepository.findById(id);
    }

    public Veiculo save(Veiculo cliente) {
        return veiculoRepository.save(cliente);
    }

    public void deleteById(long id) {
        veiculoRepository.deleteById(id);
    }

}
