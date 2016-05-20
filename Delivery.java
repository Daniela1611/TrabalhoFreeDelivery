package br.edu.ifba.mobile.wmobile.freedelivery;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.freedelivery.MotoBoy;
import br.edu.ifba.mobile.wmobile.freedelivery.MotoBoyBrasil;
import br.edu.ifba.mobile.wmobile.freedelivery.MotoBoyCandeias;
import br.edu.ifba.mobile.wmobile.freedelivery.MotoBoyCentro;
import br.edu.ifba.mobile.wmobile.freedelivery.MotoBoyVilaSerranas;
import br.edu.ifba.mobile.wmobile.freedelivery.TiposBairro;

@ManagedBean(name = "ent")
@SessionScoped
public class Delivery {

	private String login = "";
	private String resultado = "";

	public String getLogin() {
		return login;

	}

	public void setLogin(String login) {
		this.login = login;

	}

	public List<String> getTiposBairro() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Brasil");
		tipos.add("Candeias");
		tipos.add("Centro");
		tipos.add("Vila Serranas");

		return tipos;

	}

	public void setDeliveryBairro(String tipoBairro) {
		TiposBairro tipo = TiposBairro.NENHUM_BAIRRO;
		if (tipoBairro.equals("Brasil")) {
			tipo = TiposBairro.BRASIL;
		} else if (tipoBairro.equals("Candeias")) {
			tipo = TiposBairro.CANDEIAS;
		} else if (tipoBairro.equals("Centro")) {
			tipo = TiposBairro.CENTRO;
		} else if (tipoBairro.equals("Vila Serranas")) {
			tipo = TiposBairro.VILA_SERRANAS;
		}
		MotoBoy moto = new MotoBoyBrasil();
		moto.setProximoMotoBoy(new MotoBoyCandeias());
		moto.setProximoMotoBoy(new MotoBoyCentro());
		moto.setProximoMotoBoy(new MotoBoyVilaSerranas());

		resultado = moto.resolver(tipo);

	}

	public String getResultado() {
		return resultado;

	}

}
