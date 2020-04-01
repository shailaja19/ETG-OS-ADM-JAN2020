package com.sonata.ProductValidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductValid
 */
@WebServlet("/ProductValid")
public class ProductValid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductValid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	       
		String id = request.getParameter("t1");
		String proName = request.getParameter("t2");
		String proPrice = request.getParameter("t3");
		
		int proId1= Integer.parseInt(id);
		double proPrice1 = Double.parseDouble(proPrice);
		
		if(proPrice1>100)
		{
			response.sendError(proId1);
			out.print("price is more than 100");
		}
		else
			out.print(proId1);
		out.print(proName);
		out.print(proPrice1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
