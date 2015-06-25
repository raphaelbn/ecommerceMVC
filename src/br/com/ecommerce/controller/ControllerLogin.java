package br.com.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ecommerce.exceptions.UserNotRegistered;
import br.com.ecommerce.modelo.User;

@Controller
public class ControllerLogin {

	@RequestMapping("/login")
	public String loginForm() {
		return "login/formulario-login";
	}
	
	@RequestMapping("/auditLogin")
	public String auditLogin(User usuario, HttpSession session) {
		try {
			ControllerHelper helper = new ControllerHelper();
			helper.auditUserCadastrado(usuario);
			
			session.setAttribute("usuarioLogado", usuario);
			
			System.out.println(usuario.getUsuario());
			
		} catch (UserNotRegistered e) {
			e.printStackTrace();
		}
		return "menu/menu";
	}
}
