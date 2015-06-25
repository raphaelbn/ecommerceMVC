package br.com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.ecommerce.modelo.User;

public class UserDao {

	private Connection connection;
	
	public UserDao(Connection connection) {
		this.connection = connection;
	}
	public boolean cadastrado(User usuario) {
		String str = "select * from User where usuario=? and senha =?";
		try {
			PreparedStatement ps = this.connection.prepareStatement(str);
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
