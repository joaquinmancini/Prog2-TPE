package interfaces.grupal;

import java.util.ArrayList;

import composite.agrupaciones.Agrupacion;
import composite.agrupaciones.Animal;

public class PromEdadSuperior implements CriterioGrupal {
	private double valorComparable;
	
	public PromEdadSuperior(double valorComparable) {
		this.valorComparable = valorComparable;
	}
	
	public boolean cumple (Agrupacion a) {
		return (a.getEdad()>valorComparable);
	}
	
}
