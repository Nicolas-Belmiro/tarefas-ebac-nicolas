

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/helloWorld")
public class ServletApplication extends HttpServlet {

    private static final long serialVersionUID = 5181791833203158895L;

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().append(
                "<html >\r\n"
                        + "    <h1>EXERCICIO-M39-BACK</h1>\r\n"
                        + "    <h2>Hello, World!</h2>\r\n"
                        + "    <h3>Esse \"Hello, World\" foi criado via servlet no Java.</h3>\r\n"
                        + "</html>");

    }

}