public class Agency{
    private Bank bank;
    private String name;
    private String number;

   public String getBankCode(){
       return bank.getBANKCODE();
   }

    public final String getName() {
        return name;
    }

    public final  String getNumber() {
        return number;
    }

    public Agency(Bank bank, String name, String number) {
        this.bank = bank;
        this.name = name;
        this.number = number;
    }
}