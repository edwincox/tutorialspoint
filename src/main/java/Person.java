import java.util.HashMap;
import java.util.Map;

public class Person {

    private Map<Integer, Person> database = new HashMap<>();


    public void addUser(String voornaam, String achternaan){
        Person object = new Person();
        database.put(1, object);
    }


    public Person getUser(int number){
        return database.get(1);
    }

}
