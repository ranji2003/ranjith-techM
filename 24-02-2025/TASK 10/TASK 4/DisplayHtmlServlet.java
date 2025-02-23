import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayHtmlServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Get the real path of the HTML file
        String filePath = getServletContext().getRealPath("/index.html");

        // Read the file content
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        PrintWriter out = response.getWriter();
        
        String line;
        while ((line = reader.readLine()) != null) {
            out.println(line); // Print each line of HTML file
        }
        
        reader.close();
    }
}
