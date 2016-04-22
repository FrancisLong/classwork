package com.briup.ch08.service.impl;

import com.briup.ch08.common.exception.ServiceException;

import com.briup.ch08.service.IProductService;
import com.briup.ch08.dao.ProductDao;
import com.briup.ch08.bean.Product;

public class ProductServiceImpl implements IProductService {
	private ProductDao productDao;
	public ProductServiceImpl(){
		//实例化ProductDao对象
		productDao= new ProductDao();
	}
	public void add(Product product){
		productDao.save(product);
	}
	public Product find(String name)throws ServiceException{
		Product dbProduct = productDao.findByName(name);
		if(dbProduct!=null){
			if(dbProduct.getName().equals(name)){
				return dbProduct;
			}else{
			throw new ServiceException("查无此商品");
			}
		}
		return null;
	}
}
