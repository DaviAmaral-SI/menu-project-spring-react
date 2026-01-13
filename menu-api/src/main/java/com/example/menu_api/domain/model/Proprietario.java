package com.example.menu_api.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Proprietario {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

}
