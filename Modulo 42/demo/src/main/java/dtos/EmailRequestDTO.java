package dtos;

public record EmailRequestDTO(String to, String subjet, String body) {
    // Nenhum construtor, getter ou setter são necessários,
    // pois o 'record' gera automaticamente esses métodos imutáveis.
}
