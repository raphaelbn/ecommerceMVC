package br.com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ecommerce.modelo.Product;
import br.com.ecommerce.modelo.ProductType;

public class ProductDao {

private Connection connection;
	
	public ProductDao(Connection connection) {
		this.connection = connection;
	}
	
	public void addProduto(Product produto) {
String str = "insert into product(nome,tipo,descricao,valor) values('?','?','?','?')";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(str);
			
			pstmt.setString(1, produto.getNome());
			pstmt.setString(2, produto.getDescricao());
			
			pstmt.execute();
			
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addTipo(ProductType tipo) {
		String str = "insert into product_type(nome,descricao) values(?,?)";
		
		try {
			PreparedStatement pstmt = connection.prepareStatement(str);
			
			pstmt.setString(1, tipo.getNome());
			pstmt.setString(2, tipo.getDescricao());
			
			pstmt.execute();
			
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
