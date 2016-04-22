package com.briup.ch08.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.ch08.bean.Product;
import com.briup.ch08.service.IProductService;
import com.briup.ch08.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addproduct")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   //关联Service对象
	private IProductService productService;
    public AddServlet() {
        super();
        productService = new ProductServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//编码处理
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//获取参数
		String name= request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		String productPlace =request.getParameter("productPlace");
		Product product= new Product(name,price,productPlace);
		//System.out.print(name);
		//调用Service完成添加
		productService.add(product);
		//页面跳转
		request.getRequestDispatcher("/success.jsp").forward(request,response);
	}

}
