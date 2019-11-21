public class Card{
    private int number;
    private Agency agency;
    private String date_validate;
    private Person person;

    public Card(int number, Agency agency, String date_validate, Person person) {
        this.number = number;
        this.agency = agency;
        this.date_validate = date_validate;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Card [agency=" + agency.getNumber() + ", date_validate=" + date_validate + ", number=" + number + ", person="
                + person.getName() + "]";
    }
    


    
}