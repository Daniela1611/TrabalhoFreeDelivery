package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyBrasil extends MotoBoy {

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.BRASIL){
			return "Motoboy 002 dispon�vel. A entrega ser� efetuada!";
		}
	

		return proximo.resolver(delivery);
	}
	

}
