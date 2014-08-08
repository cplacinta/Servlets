package com.placinta.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class JsonServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("application/json");
    PrintWriter out = response.getWriter();
    out.println("{ \"Name\": \"Foo\", \"Id\": 1234, \"Rank\": 7 }");
    out.flush();
  }
  public void destroy() {
  }
}
