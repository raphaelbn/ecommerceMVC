package br.com.ecommerce.controler;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ecommerce.modelo.ProductType;

public class ControllerTipo {

	@RequestMapping("addTipo")
	public String addTipo(@Valid ProductType tipo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "addTipo";
		}
		ControllerHelper helper = new ControllerHelper();
		helper.addTipo(tipo);
		return "tipoCadastrado";
	}
}
