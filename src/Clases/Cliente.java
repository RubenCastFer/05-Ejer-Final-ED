package Clases;

public class Cliente {

	private String dni;
	private String nombre;
	private int telefono;
	private String direccion;
	private int numVecesAlqui;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String dni, String nombre, int telefono, String direccion, int numVecesAlqui) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.numVecesAlqui = numVecesAlqui;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getNumVecesAlqui() {
		return numVecesAlqui;
	}
	
	public void setNumVecesAlqui(int numVecesAlqui) {
		this.numVecesAlqui = numVecesAlqui;
	}
	
	
}
