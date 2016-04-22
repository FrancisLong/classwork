package com.briup.ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.briup.ch08.common.util.ConnectionFactory;
import com.briup.ch08.bean.Product;

public class ProductDao {
	public ProductDao(){
		
	}
	public void save(Product product){
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			try{
				//获取连接
				conn= ConnectionFactory.getConn();
				//3 创建pstmt对象
				String sql="insert into e_product(name,price,productPlace)"+"value(?,?,?)";
				pstmt= conn.prepareStatement(sql);
				pstmt.setString(1, product.getName());
				pstmt.setInt(2, product.getPrice());
				pstmt.setString(3, product.getProductPlace());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Product findByName(String name){
		Product product=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		try{
			try{
				//1.2获取连接
				conn=ConnectionFactory.getConn();
				//3.创建pstmt对象
				String sql="select* from e_product where name=?";
				pstmt =conn.prepareStatement(sql);
				pstmt.setString(1, name);
				//4执行sql语句
				rs= pstmt.executeQuery();
				while(rs.next()){
					Long id=rs.getLong("id");
					int price = rs.getInt("price");
					String productPlace=rs.getString("productPlace");
				    product=new Product(name,price,productPlace);
				    product.setId(id);
				    
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return product;
	}
	public void deleteById(long id){
		Connection conn=null;
		PreparedStatement pstmt= null;
		try{
			try{
				//1.2获取连接
				conn =ConnectionFactory.getConn();
				//3.加载pstmt对象
				String sql=("delete from e_product where id=?");
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				//4执行sql语句
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//public void updateById(){}
	
}
