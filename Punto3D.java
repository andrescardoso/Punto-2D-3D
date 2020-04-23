package punto;

public class Punto3D extends Punto {
	
	private double z;
	private double zoriginal;

	public Punto3D(double x, double y, double z) { // CONSTRUCTOR CON HERENCIA DE DOS PUNTOS
		super(x, y);
		this.setZ(z); // AGREGO UN TERCERO
		this.setZoriginal(z);
	}
	
	// GETTERS & SETTERS
	public double getZ() {
		return this.z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getZoriginal() {
		return zoriginal;
	}
	public void setZoriginal(double zoriginal) {
		this.zoriginal = zoriginal;
	}
	
	// RESETEADOR
	public void reset3D() {
		this.setX(this.getXoriginal());
		this.setY(this.getYoriginal());
		this.setZ(this.getZoriginal());
	}
	
	// CALCULADOR DISTANCIA 3D
	public double calcularDistancia3D(Punto punto2D) {
		Punto3D punto3D = (Punto3D) punto2D; // CASTEO DE OBJETO
		return Math.hypot(super.calcularDistancia(punto3D), this.getY() - punto3D.getZ());
	}
	
	// TOSTRING REUTILIZANDO TOSTRING 2D
	public String toString() {
		return String.format(super.toString() + " | Z: %.0f", z);
	}
	
}