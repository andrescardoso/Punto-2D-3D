package punto;

public class Main {

	public static void main(String[] args) {
		// PRUEBAS 2D
		Punto p1 = new Punto(2, 3);
		Punto p2 = new Punto(8, 4);

		System.out.println("El primer punto es: " + p1.toString());
		System.out.println("El segundo punto es: " + p2.toString());
		System.out.println("La distancia entre los dos puntos es: " + p1.calcularDistancia(p2));
		System.out.println();
		System.out.println("Cambio de valor del primer punto: ");
		p1.setX(9);
		p1.setY(6);
		System.out.println(p1);
		System.out.println("Reseteo de valor del primer punto: ");
		p1.reset();
		System.out.println(p1);
		System.out.println();
		
		// PRUEBAS 3D
		Punto3D p3 = new Punto3D (2, 4, 9);
		Punto3D p4 = new Punto3D (1, 1, 4);
		System.out.println("El primer punto es: " + p3.toString());
		System.out.println("El segundo punto es: " + p4.toString());
		System.out.println("La distancia entre los dos puntos 3D es: " + p3.calcularDistancia3D(p4));
		System.out.println();
		System.out.println("Cambio de valor del primer punto: ");
		p3.setX(4);
		p3.setY(1);
		p3.setZ(8);
		System.out.println(p3.toString());
		p3.reset3D();
		System.out.println("Reseteo de valor del primer punto: ");
		System.out.println(p3.toString());
		System.out.println();
	}
}
