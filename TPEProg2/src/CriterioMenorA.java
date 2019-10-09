
public class CriterioMenorA implements Criterio {
	private double numero;
	
	public CriterioMenorA(double numero) {
		this.numero = numero;
	}

	public boolean cumple (Animal a) {
		return (a.getEdad()<numero);
	}
}
