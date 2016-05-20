package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyVilaSerranas extends MotoBoy{

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.VILA_SERRANAS){
			return "O motoboy 0001 está disponível e é o mais indicado para essa entrega!";
		}
	
		return proximo.resolver(delivery);
	}
	

}
