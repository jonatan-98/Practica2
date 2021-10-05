package ar.edu.unlam.pb2.supermercado;

public class Supermercado {

	public void main(String args[]) {
		
		do {
			menu();
			
		}while(true);
		
		
	}
	
	public static void menu() {
		System.out.println(" ");
		System.out.println("*******************************");
		System.out.println("¡Bienvenido al supermercado!");
		System.out.println("Seleccione una opcion: ");
		System.out.println("1_Elegir productos");
		System.out.println("2_Pagar en caja");
		System.out.println("9_Salir");
		System.out.println("*******************************");
		System.out.println(" ");
	}
	
	public void opciones(byte opcionIngresada) {
		switch(opcionIngresada) {
		
		case (1):
			System.out.println("seleccione el producto:");
			System.out.println("1_Leche");
			
			System.out.println("2_Fideo");
			
			System.out.println("3_Arroz");
			
		
		}
	}
	
	public void elegirProductos() {
		
	}
	
}
