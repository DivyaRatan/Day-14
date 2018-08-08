package com.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resume
 */
@WebServlet("/Resume")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resume() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=(String) request.getParameter("firstname");
		out.write("First Name:-" +fname+"<br>");
		String lname=(String) request.getParameter("lastname");
		out.write("Last Name:-" +lname+"<br>");
		String gen=(String) request.getParameter("gender");
		out.write("Gender:-" +gen+"<br>");
		String mob=(String) request.getParameter("mobileno");
		out.write("Contact number is is:-" +mob+"<br>");
		String email=(String) request.getParameter("email");
		out.write("Email Id is:-" +email+"<br>");
		String web=(String) request.getParameter("url");
		out.write("Website is:-" +web+"<br>");
		String Quali=(String) request.getParameter("dropdown");
		out.write("Highest Qualification is:-" +Quali+"<br>");
		String hobbie=(String) request.getParameter("hobbies");
		out.write("Hobbies is/are:-" +hobbie+"<br>");
		String adrs=(String) request.getParameter("address");
		out.write("Address is:-" +adrs+"<br>");
		String summar=(String) request.getParameter("summary");
		out.write("Summary is:-" +summar+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
