package com.briup.ch08.common.test;

import com.briup.ch08.bean.Product;
import com.briup.ch08.dao.ProductDao;

public class ProductDaoTest {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		dao.save(new Product("篮球", 200, "上海"));
		System.out.println("success!");
	}
}
