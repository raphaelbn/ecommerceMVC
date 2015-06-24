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
		String str = "select * from Usuarios where usuario=? and login =?";
		try {
			PreparedStatement ps = this.connection.prepareStatement(str);
			ps.setString(1, usuario.getNome());
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
