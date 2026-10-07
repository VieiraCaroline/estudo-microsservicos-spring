package br.com.alura.microservice.fornecedor.service;

import lombok.RequiredArgsConstructor;
import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.stereotype.Service;
import br.com.alura.microservice.fornecedor.repository.InfoRepository;

@RequiredArgsConstructor
@Service
public class InfoService {
    private final InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);

    }
}
