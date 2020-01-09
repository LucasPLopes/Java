
public abstract class Veiculo {
    
    protected String modelo;
    protected String fabricante;

    public abstract String correr();

    public Veiculo() {
        modelo = "modelo de veículo";
        fabricante = "fabricante de veiculo";
    }

    public Veiculo(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
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
        if (fabricante == null) {
            if (other.fabricante != null)
                return false;
        } else if (!fabricante.equals(other.fabricante))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        return true;
    }
    
    

}