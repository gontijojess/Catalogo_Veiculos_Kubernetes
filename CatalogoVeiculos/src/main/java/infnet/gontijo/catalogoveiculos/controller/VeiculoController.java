package infnet.gontijo.catalogoveiculos.controller;

import infnet.gontijo.catalogoveiculos.model.Veiculo;
import infnet.gontijo.catalogoveiculos.repository.VeiculoRepository;
import infnet.gontijo.catalogoveiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> getAll() {
        return veiculoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getById(@PathVariable long id) {
        Optional<Veiculo> veiculo = veiculoService.findById(id);
        return veiculo.isPresent() ? ResponseEntity.ok(veiculo.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Veiculo> create(@RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = veiculoService.save(veiculo);
        return ResponseEntity.ok(novoVeiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> update(@PathVariable long id, @RequestBody Veiculo veiculo) {
        Optional<Veiculo> veiculoOptional = veiculoService.findById(id);
        if(veiculoOptional.isPresent()) {
            Veiculo veiculoToUpdate = veiculoOptional.get();
            veiculoToUpdate.setMarca(veiculo.getMarca());
            veiculoToUpdate.setModelo(veiculo.getModelo());
            veiculoToUpdate.setAno(veiculo.getAno());
            veiculoToUpdate.setCor(veiculo.getCor());
            Veiculo veiculoUpdated = getSave(veiculoToUpdate);
            return ResponseEntity.ok(veiculoUpdated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private Veiculo getSave(Veiculo clientToUpdate) {
        return veiculoService.save(clientToUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Veiculo> delete(@PathVariable long id) {
        if(veiculoService.findById(id).isPresent()) {
            veiculoService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
