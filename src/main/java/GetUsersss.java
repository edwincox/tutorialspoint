import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetUsersss extends HttpServlet {


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        // This method executes whenever the servlet is hit
        // increment hitCount

        PrintWriter out = response.getWriter();
        int number = Integer.parseInt(request.getParameter("number"));


        // Maak een object aan
        PersonRepository personRepository = new PersonRepository();
        Person object = personRepository.getUser(number);
        String voormij = object.getVoornaam();


        String title = "Total Number of Hits";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\"> "
                + "Nummer int uit interger parseint: " + number + "<br><br>"
                + "terug van object voornaam: " + object.getVoornaam() + "<br><br>"
                + "Object opgehaald: " + voormij  + "<br><br>"
                //+ "Object opgehaald: " + terug + "<br><br>"
                + "</h2>\n" +
                "</body></html>");

    }
}