package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyCandeias extends MotoBoy{

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.CANDEIAS){
			return "Motoboy 005 dispon�vel. A entrega ser� efetuada!";
		}

		
		return proximo.resolver(delivery);
	}
	

}
