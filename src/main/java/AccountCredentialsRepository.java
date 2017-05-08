import java.util.HashMap;
import java.util.Map;

public class AccountCredentialsRepository {

    private Map<Integer, Person> database = new HashMap<>();

    public Integer createAccountForUser(String voornaam, String achternaam){
        Person persoon = new Person(voornaam, achternaam);
        int number = getUniqueNumberForCreateAccount();
        this.database.put(number, persoon);

        return number;
    }

    public Person getAccountForUser(int number){

        // wanneer user niet bestaat (het nummer niet aanwezig is in de list) afvangen
        Person waardeOpgehaaltUitDeGetHashmap = null;
        waardeOpgehaaltUitDeGetHashmap = database.get(number);

        if (waardeOpgehaaltUitDeGetHashmap == null){
            System.out.println("Opgeven number: " + number + "bestaat niet in Hashmap");
            throw new NullPointerException("Dit gaat helemaal fout");
        }
//        try{
//
//            return waardeOpgehaaltUitDeGetHashmap;
//        }catch (NullPointerException e){
//        }

        return waardeOpgehaaltUitDeGetHashmap;
    }

    public int getUniqueNumberForCreateAccount(){
        // Laatste number in hashmap ophalen +1 er bij optellen
        int nextnumber = database.size() + 1;
        return nextnumber;
    }
}