public class Pessoa implements Comparable<Pessoa> {
    protected int ano;
    
    @Override
    public int compareTo(Pessoa p) {
      
        if ( this.ano <p.ano)
            return -1;
        else if(this.ano > p.ano)
            return 1;
        
        return 0;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Pessoa [ano=" + ano + "]";
    }
    
    

    
}
