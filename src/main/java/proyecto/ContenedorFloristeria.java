package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class ContenedorFloristeria {
	
	static Scanner entrada = new Scanner(System.in);
	
	private static ArrayList<Floristeria> contenedor = new ArrayList<Floristeria>();

	//metodo crear floristería
	public static void crearFloristeria(Floristeria floristeria1) {
		
		String nombre;
		
		System.out.println("Introducir nombre para la nueva floristería: ");
		nombre = entrada.next();
		
		for ( int i = 0; i < contenedor.size(); i++) {
			
			while(contenedor.get(i).getNombre().equals(nombre)) {
			
				if (contenedor.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("El nombre introducido ya existe.");
				
				System.out.println("Introducir el nombre para la nueva floristería: ");
				nombre = entrada.next();
				} 
			}
		}
		
		floristeria1 = new Floristeria(nombre);
		
		contenedor.add(floristeria1);
		
		System.out.println("La floristería " + floristeria1.getNombre() + " se ha creado correctamente.");
		
	}
}
