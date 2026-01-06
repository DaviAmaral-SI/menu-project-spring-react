package com.example.menu_api.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.menu_api.domain.model.Proprietario;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var prop1 = new Proprietario();
        prop1.setId(1L);
        prop1.setNome("João Silva");
        prop1.setEmail("teste@gmail.com");
        prop1.setTelefone("123456789");

        var prop2 = new Proprietario();
        prop2.setId(2L);
        prop2.setNome("Maria Oliveira");
        prop2.setEmail("maria.oliveira@gmail.com");
        prop2.setTelefone("987654321");

        return Arrays.asList(prop1, prop2);
    }
}
