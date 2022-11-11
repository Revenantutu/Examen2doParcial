import java.util.Scanner;

public class Alumnos {
	private static Scanner teclado =new Scanner(System.in);
	

	public static void main(String[] args) {

		String nombre;
		int ID;
		String Materia;
		double primerparcial;
		double segundoparcial;
		double tercerparcial;
		
		
		Notas notas [] = new Notas [5] ;
		
		
		for ( int i = 0; i <5; i++) {
			
			System.out.print("Introduce Nombre \n");
				nombre = teclado.nextLine();

			System.out.print("Introduce ID \n");
				ID = teclado.nextInt();

			System.out.print("Introduce Materia \n");
				Materia = teclado.nextLine();

			System.out.print("Introduce nota 1mer Parcial \n");
				primerparcial = Double.parseDouble(teclado.nextLine());

			System.out.print("Introduce nota 2do Parcial \n");
				segundoparcial = teclado.nextDouble();

			System.out.print("Introduce nota 3cer Parcial \n");
				tercerparcial = teclado.nextDouble();
				
				
				Notas misNotas = new Notas(nombre,ID,asignacion,primerparcial,segundoparcial,tercerparcial);
				notas [i]= misNotas;
			
		}
		
		for (int i = 0; i <5;i++) {
				System.out.print("Nombre: " + notas[i].getNombre()+"/n");
				System.out.print("ID: " + notas[i].getID()+"/n");
				System.out.print("Promedio de: " + notas[i].getasignacion() + " es " + 
								(notas[i].getprimerParcial()+notas[i].getsegundoParcial()+
								notas[i].gettercerParcial()/3));
				
				System.out.print("********");
    
			
	
	}
    }
	}

}
