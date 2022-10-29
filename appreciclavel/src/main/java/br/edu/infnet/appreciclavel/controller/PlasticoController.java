package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;

@Controller
public class PlasticoController {

	@GetMapping(value = "plastico/lista")
	public String telaLista(Model model) {

		Plastico p1 = new Plastico();
		p1.setCodigo(7);
		p1.setReutilizavel(false);
		p1.setPeso((float) 0.1);
		p1.setValor((float) 0.05);
		p1.setTipo(TipoPlastico.pet1000);
		p1.setMarca("Campo Largo");
		p1.setDescricao("VINHO");

		Plastico p2 = new Plastico();
		p2.setCodigo(8);
		p2.setReutilizavel(false);
		p2.setPeso((float) 0.05);
		p2.setValor((float) 0.025);
		p2.setTipo(TipoPlastico.pet600);
		p2.setMarca("Coca-Cola");
		p2.setDescricao("Refrigerante");

		Plastico p3 = new Plastico();
		p3.setCodigo(9);
		p3.setReutilizavel(false);
		p3.setPeso((float) 0.15);
		p3.setValor((float) 0.085);
		p3.setTipo(TipoPlastico.pvc);
		p3.setMarca("TIGRE");
		p3.setDescricao("TUBO 10");

		List<Plastico> plasticos = new ArrayList<Plastico>();
		plasticos.add(p1);
		plasticos.add(p2);
		plasticos.add(p3);
		model.addAttribute("listagem", plasticos);

		return "plastico/lista";

	}

}
