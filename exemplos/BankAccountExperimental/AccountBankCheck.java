public class AccountBankCheck{
    
    public static boolean confirmOrignAccount(Account account, Bank bank){
        return (bank.getBANKCODE()).equals(account.getBankcode());
    }
    public static boolean confirmAssociateMember(Person p, AccountPJ pj){
        return pj.getNameOfAssociates().contains(p.getName());    
    }
    
}