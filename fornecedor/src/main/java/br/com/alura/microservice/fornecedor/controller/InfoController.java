package br.com.alura.microservice.fornecedor.controller;


import lombok.RequiredArgsConstructor;
import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.alura.microservice.fornecedor.service.InfoService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {
    private final InfoService infoService;

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {

       return infoService.getInfoPorEstado(estado);

    }
}
