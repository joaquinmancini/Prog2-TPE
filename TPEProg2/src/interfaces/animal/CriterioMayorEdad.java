package interfaces.animal;
import composite.agrupaciones.Animal;

public class CriterioMayorEdad implements Criterio {
	private double numero;
	private String nombre;
	public CriterioMayorEdad(double numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (a.getEdad()>numero);
	}
}
