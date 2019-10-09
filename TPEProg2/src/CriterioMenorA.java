
public class CriterioMenorA implements Criterio {
	private double numero;
	private String nombre;
	
	public CriterioMenorA(double numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}

	public boolean cumple (Animal a) {
		return (a.getEdad()<numero);
	}
}
