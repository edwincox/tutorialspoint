public class run {


    public static void main(String[] args) {

        String voornaam = "Fred";
        String achternaam = "Willems";

        PersonRepository personRepository = new PersonRepository();
        personRepository.addUser(voornaam, achternaam);

        Person object = personRepository.getUser(2);

        System.out.println(object.getVoornaam());

    }

}
