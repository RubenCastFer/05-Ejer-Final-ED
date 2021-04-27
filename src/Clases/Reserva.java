package Clases;

import java.util.Date;

public class Reserva {
	
	private Date fechaInicio;
	private Date fechaFin;
	private boolean entrega;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reserva(Date fechaInicio, Date fechaFin, boolean entrega) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.entrega = entrega;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public boolean isEntrega() {
		return entrega;
	}
	
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

	public int precioTotal(int precio) {
		return 0;
	}
	


}
