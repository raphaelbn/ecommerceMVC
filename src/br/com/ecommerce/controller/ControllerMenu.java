package br.com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMenu {

	@RequestMapping("menu/addProduto")
	public String menuAddProduto() {
		return "produto/formAddProduto";
	}
	
	@RequestMapping("menu/listarProdutos")
	public String menuListarProdutos() {
		return "produto/listarProdutos";
	}
	
	@RequestMapping("menu/addTipo")
	public String menuAddTipo() {
		return "tipo/formAddTipo";
	}
	
	@RequestMapping("menu/listarTipos")
	public String menuListarTipos() {
		return "tipo/listarTipos";
	}
}
