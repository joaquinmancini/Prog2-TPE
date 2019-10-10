import composite.agrupaciones.Animal;
import interfaces.animal.Criterio;

public class CriterioMayorPeso implements Criterio {
	private double peso;
	private String nombre;
	public CriterioMayorPeso(double peso, String nombre) {
		this.peso = peso;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (a.getPeso()>peso);
	}
}
