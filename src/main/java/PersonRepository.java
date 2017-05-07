public class PersonRepository {

    public static AccountCredentialsRepository account = new AccountCredentialsRepository();

    public void addUser(String voornaam, String achternaam){
       account.createAccountForUser(voornaam, achternaam);
    }

    public Person getUser(int number){
       Person gegevens = account.getAccountForUser(number);
        return gegevens;
    }
}