import java.util.ArrayList;
import java.util.StringJoiner;

public class AccountPJ extends Account implements InternationalAccount {
    private final ArrayList<Person> associates;
    private boolean internationalAccount = false;

    public AccountPJ(final String bankcode, final Agency agency, final Person person, final double value,
            final ArrayList<Person> associates) {
        super(bankcode, agency, person, value);
        this.associates = new ArrayList<>(associates);

    }

    public final String getNameOfAssociates() {

        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.setEmptyValue("{}");

        associates.forEach(a -> sj.add(String.format("\"%s\"", a.getName())));
        return sj.toString();

    }

    public AccountPJ(final String bankcode, final Agency agency, final Person person, final double value) {
        super(bankcode, agency, person, value);
        associates = null;

    }

    @Override
    public boolean isInternational() {
        return this.internationalAccount;
    }

    @Override
    public void setInternational(Boolean value) {
        // TODO Auto-generated method stub
        internationalAccount = value;
    }
    
}