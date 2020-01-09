public abstract class Veiculo{
    private static Long GERA_ID = 0L;
    protected Long id ;
    protected String modelo;
    protected String fabricante;

    public abstract String correr();

    public Veiculo() {
        id =  GERA_ID;
        GERA_ID = GERA_ID + 1L;
        modelo = "modelo de veículo";
        fabricante = "fabricante de veiculo";
    }

    public Veiculo(String modelo, String fabricante) {
        this();
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Veiculo other = (Veiculo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
}