package br.com.alura.microservice.loja.dto;

public record EnderecoDto(
        String rua,
        int numero,
        String estado
) {
}
