package br.com.ecommerce.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlerMenu {

	@RequestMapping("menu/addProduto")
	public String menuAddProduto() {
		return "produto/addProduto";
	}
	
	@RequestMapping("menu/listarProdutos")
	public String menuListarProdutos() {
		return "produto/listarProdutos";
	}
	
	@RequestMapping("menu/addTipo")
	public String menuAddTipo() {
		return "tipo/addTipo";
	}
	
	@RequestMapping("menu/listarTipos")
	public String menuListarTipos() {
		return "tipo/listarTipos";
	}
}
