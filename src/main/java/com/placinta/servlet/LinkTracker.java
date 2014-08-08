package com.placinta.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LinkTracker extends HttpServlet {

  private static final long serialVersionUID = -2128122335811219481L;
  public static final String TEXT_HTML = "text/html";
  public static final String TEXT_XML = "application/xml";
  public static final String TEXT_JSON = "application/json";

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    handleRequest(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    handleRequest(request, response);
  }

  public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String headerNames = request.getHeader("accept");
    System.out.println(headerNames);
    response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    String htmlPath = getServletConfig().getInitParameter(TEXT_HTML);
    String xmlPath = getServletConfig().getInitParameter(TEXT_XML);
    String jsonPath = getServletConfig().getInitParameter(TEXT_JSON);

    /*if (headerNames.contains(TEXT_HTML)) {
      response.sendRedirect(htmlPath);
      return;
    } else */if (headerNames.contains(TEXT_XML)) {
      response.sendRedirect(xmlPath);
      return;
    } else if (headerNames.contains(TEXT_JSON)) {
      response.sendRedirect(jsonPath);
    }

    response.setContentType("text/plain");
    PrintWriter writer = response.getWriter();
    writer.print("No alternatives found\n");
  }

}
