package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyBrasil extends MotoBoy {

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.BRASIL){
			return "O motoboy 0002 está disponível e é o mais indicado para essa entrega!";
		}
		

		return proximo.resolver(delivery);
	}
	

}
