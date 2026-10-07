package br.com.alura.microservice.loja.dto;

import java.util.List;

public record CompraDto(
        List<ItemDaCompraDto> itens,
        EnderecoDto endereco
) {
}
