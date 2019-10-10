package interfaces.grupal;

public class PromEdadSuperior implements CriterioGrupal {
	private double totalEdad;
	private double valorComparable;
	
	public PromEdadSuperior(int totalEdad, double valorComparable) {
		this.totalEdad = totalEdad;
		this.valorComparable = valorComparable;
	}
	
	public boolean cumple () {
		return ((totalEdad)>(valorComparable));
	}
	
}
