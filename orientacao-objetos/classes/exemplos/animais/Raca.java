package animais;

public enum Raca{
    FELINA("FELINA"),
    CANINA("CANINA"),
    OVIPARO("OVÍPARO"),
    AVE("AVE"),
    SUINO("SUINO");
    private String raca;
    private Raca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }
    
}