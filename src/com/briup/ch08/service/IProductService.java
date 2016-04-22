package com.briup.ch08.service;

import com.briup.ch08.common.exception.ServiceException;

import com.briup.ch08.bean.Product;

public interface IProductService {
	public void add(Product product);
	public Product find(String name) throws ServiceException;
}
