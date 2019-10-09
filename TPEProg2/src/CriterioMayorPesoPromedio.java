
public class CriterioMayorPesoPromedio implements Criterio {
	private double peso;
	private int cantidad;
	private String nombre;
	public CriterioMayorPesoPromedio(double peso,int cantidad, String nombre) {
		this.peso = peso;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (a.getPeso()>peso);
	}
}
