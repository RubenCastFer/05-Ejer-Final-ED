package Clases;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private Combustible combustible;
	private String modelo;
	private String color;
	private int precio;
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(String matricula, String marca, Combustible combustible, String modelo, String color, int precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.combustible = combustible;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
