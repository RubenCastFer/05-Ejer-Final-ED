package Clases;

public class ClientePremiun extends Cliente {

	public int descuento (int precio) {
		int descuento;
		descuento = precio*10/100;
		return descuento;
		
	}
}
