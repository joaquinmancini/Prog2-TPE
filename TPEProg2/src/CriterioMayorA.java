
public class CriterioMayorA implements Criterio {
	private double numero;
	
	public CriterioMayorA(double numero) {
		this.numero = numero;
	}

	public boolean cumple (Animal a) {
		return (a.getEdad()>numero);
	}
}
