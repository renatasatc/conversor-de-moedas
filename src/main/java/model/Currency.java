package model;

public enum Currency {
    USD("USD", "Dólar Americano"),
    BRL("BRL", "Real Brasileiro"),
    ARS("ARS", "Peso Argentino"),
    EUR("EUR", "Euro"),
    CNY("CNY", "Yuan Chinês"),
    KES("KES", "Xelim Queniano"),
    BOB("BOB", "Boliviano");

    private final String code;
    private final String nomeCompleto;

    // Construtor agora aceita dois parâmetros
    Currency(String code, String nomeCompleto) {
        this.code = code;
        this.nomeCompleto = nomeCompleto;
    }

    public String code() {
        return code;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return code;
    }
}
