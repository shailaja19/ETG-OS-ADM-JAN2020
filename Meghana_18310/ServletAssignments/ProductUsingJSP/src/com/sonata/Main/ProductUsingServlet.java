package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.DAOImpl.ProductDAOImpl;
import com.sonata.Model.Product;

/**
 * Servlet implementation class ProductUsingServlet
 */
@WebServlet("/ProductUsingServlet")
public class ProductUsingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUsingServlet() {
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
		String proPrice = request.getParameter("proPrice");
		
		int proId1= Integer.parseInt(id);
		double proPrice1 = Double.parseDouble(proPrice);
		 
		   Product p=new Product();
			p.setProId(proId1);
			p.setProName(proName);
			p.setProPrice(proPrice1);
			
			ProductDAOImpl dao=new ProductDAOImpl();
			int s1=dao.addP(p);
			 out.println("one row is inserted " + s1);
			
			List<Product> list=dao.getData();
			for(Product pi:list) {
				
				out.println(pi.getProId());
				out.println(pi.getProName());
				out.println(pi.getProPrice());
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
