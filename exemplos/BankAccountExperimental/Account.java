public abstract class Account {
    private String bankcode;
    private Agency agency;
    private Person person;
    private double value;

    public String getBankcode() {
        return bankcode;
    }


    public Agency getAgency() {
        return agency;
    }
    public Person getPerson() {
        return person;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Account(String bankcode, Agency agency, Person person, double value) {
        this.bankcode = bankcode;
        this.agency = agency;
        this.person = person;
        this.value = value;
    }

    

    
    
    
}