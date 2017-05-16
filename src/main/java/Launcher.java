public class Launcher {

    public static void main(String[] args) {

        String voornaam = "Fred";
        String achternaam = "Willems";

        PersonRepository personRepository = new PersonRepository();
        personRepository.addUser(voornaam, achternaam);

        Person object = personRepository.getUser(2);
        //Person object = null;

        System.out.println(object.getVoornaam());

    }

}
