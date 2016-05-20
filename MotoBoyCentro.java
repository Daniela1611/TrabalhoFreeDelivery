package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyCentro extends MotoBoy {

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.CENTRO){
			return "O motoboy 0009 está disponível e é o mais indicado para essa entrega!";
		}

		return proximo.resolver(delivery);
	}
	

}
