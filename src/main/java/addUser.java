import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class addUser extends HttpServlet {

    public Person person;

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {



        // Set response content type
        response.setContentType("text/html");
        // This method executes whenever the servlet is hit
        // increment hitCount

        PrintWriter out = response.getWriter();
        String voornaam = request.getParameter("voornaam");
        String achternaam = request.getParameter("achternaam");

        // URL om te get
        // http://192.168.0.67:8181/tutorialspoint-1.0-SNAPSHOT/addUser?voornaam=df&achternaam=df

        // Maak object aan
        person.addUser(voornaam, achternaam);

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
                + "Voornaam" + request.getParameter("voornaam")
                + "Achternaam" + request.getParameter("achternaam")
                + "</h2>\n" +
                "</body></html>");

    }
    public void destroy()
    {
        // This is optional step but if you like you
        // can write hitCount value in your database.
    }

}
