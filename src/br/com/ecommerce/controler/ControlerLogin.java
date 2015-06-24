package br.com.ecommerce.controler;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ecommerce.exceptions.UserNotRegistered;
import br.com.ecommerce.modelo.User;

@Controller
public class ControlerLogin {

	@RequestMapping("/login")
	public String loginForm() {
		return "formulario-login";
	}
	
	@RequestMapping("/auditLogin")
	public String auditLogin(User usuario, HttpSession session) {
		try {
			ControllerHelper helper = new ControllerHelper();
			helper.auditUserCadastrado(usuario);
			
			session.setAttribute("usuarioLogado", usuario);
			
		} catch (UserNotRegistered e) {
			e.printStackTrace();
		}
		return "menu";
	}
}
