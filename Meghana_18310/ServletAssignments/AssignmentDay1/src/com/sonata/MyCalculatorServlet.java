package com.sonata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCalculatorServlet
 */
@WebServlet("/MyCalculatorServlet")
public class MyCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String op = request.getParameter("op"); 
       
        
        if(op.equals("Addition")){
             out.println((Integer.parseInt(n1) + Integer.parseInt(n2)));
        }
        else if(op.equals("Subtraction")){
             out.println(Integer.parseInt(n1) - Integer.parseInt(n2));
        }
        else if(op.equals("multiplication")){
             out.println(Integer.parseInt(n1) * Integer.parseInt(n2));
        }
        else{
            out.println(Integer.parseInt(n1) / Integer.parseInt(n2));
        }

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
