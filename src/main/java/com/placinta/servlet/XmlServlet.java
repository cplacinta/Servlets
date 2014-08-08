package com.placinta.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class XmlServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("application/xml");
    PrintWriter out = response.getWriter();
    out.println("<h1>" + "XML" + "</h1>");
    out.flush();
  }
  public void destroy() {
  }
}
