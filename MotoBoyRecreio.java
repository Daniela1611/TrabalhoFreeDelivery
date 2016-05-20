package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyRecreio extends MotoBoy{

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.RECREIO){
			return "Motoboy 001 dispon�vel. A entrega ser� efetuada!";
		}
	
		return proximo.resolver(delivery);
	}
	

}
