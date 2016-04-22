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
 * Servlet implementation class FindServlet
 */
@WebServlet("/findproduct")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IProductService productService;
    public FindServlet() {
        super();
        productService =new ProductServiceImpl();
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
		//设置编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//获取参数
		String name =request.getParameter("name");
		//调用Service完成业务逻辑
		Product product = productService.find(name);
		request.setAttribute("product", product);
		//页面跳转
		request.getRequestDispatcher("/showproduct.jsp").forward(request, response);
	}

}
