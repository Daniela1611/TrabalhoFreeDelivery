package br.edu.ifba.mobile.wmobile.freedelivery;


public class MotoBoyRecreio extends MotoBoy{

	@Override
	public String resolver(TiposBairro delivery) {
		if (delivery == TiposBairro.RECREIO){
			return "Motoboy 001 disponível. A entrega será efetuada!";
		}
	
		return proximo.resolver(delivery);
	}
	

}
