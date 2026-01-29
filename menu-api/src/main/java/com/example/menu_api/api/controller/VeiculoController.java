package com.example.menu_api.api.controller;

import com.example.menu_api.domain.model.Veiculo;
import com.example.menu_api.domain.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    @GetMapping("/{veiculoId}")
    public ResponseEntity<Veiculo> buscar(@PathVariable Long veiculoId) {
        return veiculoRepository.findById(veiculoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
