package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyCentro extends MotoBoy {

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.CENTRO){
			return "Motoboy 009 dispon�vel. A entrega ser� efetuada!";
		}

		return proximo.resolver(delivery);
	}
	

}
