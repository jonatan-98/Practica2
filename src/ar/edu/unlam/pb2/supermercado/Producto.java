package ar.edu.unlam.pb2.supermercado;

public class Producto {
	
	protected String nombre;
	protected byte precio;
	protected int codigoDeBarra;
	
	
	public Producto(String nombre, byte precio, int codigoDeBarra) {
		this.nombre= nombre;
		this.precio = precio;
		this.codigoDeBarra = codigoDeBarra;
	}
	
	
}
