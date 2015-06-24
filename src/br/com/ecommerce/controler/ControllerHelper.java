package br.com.ecommerce.controler;

import java.sql.Connection;

import br.com.ecommerce.dao.ConnectionFactory;
import br.com.ecommerce.dao.ProductDao;
import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.exceptions.UserNotRegistered;
import br.com.ecommerce.modelo.Product;
import br.com.ecommerce.modelo.ProductType;
import br.com.ecommerce.modelo.User;

public class ControllerHelper {

	private Connection connection;
	
	public ControllerHelper() {
		this.connection = new ConnectionFactory().getConnection();
	}

	protected void auditUserCadastrado(User usuario) throws UserNotRegistered {
		UserDao usuarioDao = new UserDao(connection);
		if(!usuarioDao.cadastrado(usuario)){
			throw new UserNotRegistered();
		}
	}
	
	protected void addProduto(Product produto) {
		ProductDao dao = new ProductDao(connection);
		dao.addProduto(produto);
	}
	
	protected void addTipo(ProductType tipo) {
		ProductDao dao = new ProductDao(connection);
		dao.addTipo(tipo);
	}
}
