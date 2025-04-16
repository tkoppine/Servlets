package org.codewithteja;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp ) throws IOException {
        System.out.println("In Service");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2><b>Hello World</b></h2>");
    }
}
