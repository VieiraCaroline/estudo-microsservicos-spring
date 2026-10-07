package br.com.alura.microservice.loja.service;

import br.com.alura.microservice.loja.dto.CompraDto;
import br.com.alura.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {
    public void realizaCompra(CompraDto compra) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDto> exchance =
        client.exchange("http://fornecedor/info/" + compra.endereco().estado(),
                HttpMethod.GET, null, InfoFornecedorDto.class);

        System.out.println(exchance.getBody().endereco());
    }

}
