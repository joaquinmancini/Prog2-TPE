package interfaces.grupal;

public class PromPesoSuperior implements CriterioGrupal {
	private double totalPeso;
	private double valorComparable;
	
	public PromPesoSuperior( double totalPeso, double valorComparable) {
		this.totalPeso = totalPeso;
		this.valorComparable = valorComparable;
	}

	public boolean cumple () {
		return(totalPeso)>(valorComparable);
	}
	
}
