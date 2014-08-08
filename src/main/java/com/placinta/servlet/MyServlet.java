package com.placinta.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {

  public static final String USER_NAME = "userName";

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    //object out of type PrinWriter i se atribuie response.getWriter;
    PrintWriter out = response.getWriter();
    // setam contentType of response
    response.setContentType("text/html");

    // getting the parameter Value from parameter name
    String[] paramValues = request.getParameterValues(USER_NAME);
    String userName = paramValues != null && paramValues.length > 0 ? paramValues[0] : "Anonymous";
    out.println("Hello " + userName);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {
    doGet(request, response);
  }

}
