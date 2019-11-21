import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        final Bank bank = new Bank("BK007BR");
        bank.setRegister("BR007122019");
        bank.setName("Banco do Brasil S.A.");
        Welcome.welcomeHome(bank);
        final Agency agency = new Agency(bank, "Rua dos prazeres", "7000");
        final ArrayList<Person> persons = new ArrayList<>();

        final Person owner = new Person("Sílvio Santos");
        final Person pedro = new Person("Pedro");
        System.out.println(owner.toJSON());

        persons.add(new Person("Lucas"));
        persons.add(new Person("Alexandre"));
        persons.add(new Person("Fabrício"));
        persons.add(pedro);


        final AccountPJ account = new AccountPJ(agency.getBankCode(), agency, owner, 500000, persons);
        account.setInternational(true);
        System.out.println(account.getNameOfAssociates());

        if (account.isInternational())
            System.out.println("É internacional");
        else
            System.out.println("Não é possível fazer movimentações internacionais");
        if(AccountBankCheck.confirmAssociateMember(pedro, account))
            System.out.println("Pedro é associado da conta de  "+ account.getPerson().getName());
        else
            System.out.println("Não é associado");

    }
}