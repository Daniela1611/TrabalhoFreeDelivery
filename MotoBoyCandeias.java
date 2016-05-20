package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyCandeias extends MotoBoy{

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.CANDEIAS){
			return "O motoboy 0005 está disponível e é o mais indicado para essa entrega!";
		}

		
		return proximo.resolver(delivery);
	}
	

}
