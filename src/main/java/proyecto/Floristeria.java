package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Floristeria {

	//El contenedor
	
	private List<Floristeria> arboles = new ArrayList();
	private List<Floristeria> decoraciones = new ArrayList();
	private List<Floristeria> flores = new ArrayList();
	
	public void anadirArbol() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre del �rbol: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio del �rbol: ");
		double precio = entrada.nextDouble();
		System.out.println("Altura del �rbol: ");
		double altura = entrada.nextDouble();
		
		//Arbol arbol = new Arbol(nombre,precio, altura);
		//arboles.add(arbol);
	}
	
	public void anadirFlor() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre de la flor: ");
		String nombre = entrada.nextLine();
		System.out.println("Color de la flor: ");
		String color = entrada.nextLine();
		System.out.println("Precio de la flor: ");
		double precio = entrada.nextDouble();
		
		//Flor flor = new Flor(nombre,precio, color);
		//flores.add(flor);
	}
	
	public void anadirDecoracion() {
		Scanner entrada = new Scanner(System.in);
		
		boolean elegido = false;
		System.out.println("Nombre de la decoraci�n: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio de la decoraci�n: ");
		double precio = entrada.nextDouble();
		
		int material;
		do {
			System.out.println("Elija material (0-Madera, 1-Pl�stico) ");
			material = entrada.nextInt();
			if(material == 0 || material == 1) {
				elegido = true;
			}else {
				System.out.println("opcion no correcta");
			}
		}while(!elegido);
		
//		Decoracion decoracion = new Decoracion(nombre,precio,material);
//		decoraciones.add(decoracion);
	}


	
	

}
