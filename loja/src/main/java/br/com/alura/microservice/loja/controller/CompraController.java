package br.com.alura.microservice.loja.controller;

import br.com.alura.microservice.loja.dto.CompraDto;
import br.com.alura.microservice.loja.service.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/compra")
public class CompraController {
    private final CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDto compra) {
        compraService.realizaCompra(compra);
    }
}
