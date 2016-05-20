package br.edu.ifba.mobile.wmobile.freedelivery;



public abstract class MotoBoy {
	
	protected MotoBoy proximo = null;
	
	public void setProximoMotoBoy(MotoBoy proximo)
	{
		if (this.proximo != null){
			this.proximo.setProximoMotoBoy(proximo);
			
		}else{
			this.proximo = proximo;
			
		}
	}
	
	public abstract String resolver (TiposBairro delivery);

}
