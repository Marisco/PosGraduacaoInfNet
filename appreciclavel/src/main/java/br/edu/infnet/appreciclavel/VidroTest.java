package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.controller.VidroController;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;

@Component
public class VidroTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("--------Cadastro de Vidros--------");

		Vidro v1 = new Vidro();
		v1.setCodigo(10);
		v1.setReutilizavel(true);
		v1.setPeso((float) 0.35);
		v1.setValor((float) 0.03);
		v1.setTipo(TipoGarrafa.garrafa500);
		v1.setMarca("DON SIMON");
		v1.setDescricao("VINHO");
		VidroController.incluit(v1);
		System.out.println("VIDRO: " + v1);

		Vidro v2 = new Vidro();
		v2.setCodigo(11);
		v2.setReutilizavel(true);
		v2.setPeso((float) 0.45);
		v2.setValor((float) 0.05);
		v2.setTipo(TipoGarrafa.garrafa600);
		v2.setMarca("COCA-COLA");
		v2.setDescricao("REFRIGERANTE");
		VidroController.incluit(v2);
		System.out.println("Vidro: " + v2);

		Vidro v3 = new Vidro();
		v3.setCodigo(12);
		v3.setReutilizavel(true);
		v3.setPeso((float) 0.55);
		v3.setValor((float) 0.07);
		v3.setTipo(TipoGarrafa.garrafa1000);
		v3.setMarca("GALO");
		v3.setDescricao("AZEITE");
		VidroController.incluit(v3);
		System.out.println("Vidro: " + v3);

	}

}
