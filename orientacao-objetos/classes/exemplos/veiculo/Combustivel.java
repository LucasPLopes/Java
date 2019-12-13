package veiculo;

public enum Combustivel {
    
    ALCOOL(0),
    GASOLINA(1),
    FLEX(2), 
    DIESEL(3),
    ELETRICO(4),
    HIBRIDO(5);

    private Integer tipo;

    private Combustivel(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return this.tipo;
    }

}