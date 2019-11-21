import java.lang.reflect.Field;
import java.util.StringJoiner;
import java.util.UUID;

public class Person {
    private String name;
    private String uuid;
    private String date = "07/12/1995";
    private String origin = "Brasil";
    private String father = "Father";
    private String mother = "Mother";



    public Person(String name) {
        this.name = name;
        uuid = UUID.randomUUID().toString();
    }
    public Person(){
        uuid = UUID.randomUUID().toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toJSON() {
        StringJoiner sj = new StringJoiner(",\n", "{\n", "\n}");
        Class<Person> classe = Person.class;
        for (Field fd : classe.getDeclaredFields()) {
          
            try {
                sj.add(String.format("\"%s\" : \"%s\"", fd.getName(), (String) fd.get(this)));
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         
        }
        return sj.toString();
    }
    
}