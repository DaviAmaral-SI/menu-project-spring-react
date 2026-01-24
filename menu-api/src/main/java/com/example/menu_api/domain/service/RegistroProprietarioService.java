package com.example.menu_api.domain.service;

import com.example.menu_api.domain.exception.NegocioException;
import com.example.menu_api.domain.model.Proprietario;
import com.example.menu_api.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class RegistroProprietarioService {

    private ProprietarioRepository proprietarioRepository;

    @Transactional
    public Proprietario salvar(Proprietario proprietario){
        boolean emailEmUso = proprietarioRepository.findByEmail(proprietario.getEmail())
                .filter(p -> !p.equals(proprietario))
                .isPresent();

        if(emailEmUso){
            throw new NegocioException("E-mail já em uso");
        }

        return proprietarioRepository.save(proprietario);
    }

    @Transactional
    public void excluir(Long proprietarioId){
        proprietarioRepository.deleteById(proprietarioId);
    }

}
