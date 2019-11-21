public class Bank{
    private String name;
    private String register;
    private final String BANKCODE;

    public Bank(String bANKCODE) {
        BANKCODE = bANKCODE;
    }
    

    public final String getName() {
        return name;
    }
    public final String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public final String getBANKCODE() {
        return BANKCODE;
    }
    
    public static boolean isAgencyOfBank(Agency ag, Bank bk){
        if((ag.getBankCode()).equals(bk.getBANKCODE()))
            return true;
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}