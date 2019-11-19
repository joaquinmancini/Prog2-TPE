package interfaces.grupal;

import java.util.ArrayList;

import composite.agrupaciones.Agrupacion;
import composite.agrupaciones.Animal;

public class PromPesoSuperior implements CriterioGrupal {
	private double valorComparable;
	
	public PromPesoSuperior( double valorComparable) {
		this.valorComparable = valorComparable;
	}

	public boolean cumple (Agrupacion a) {
		return (a.getPeso()>valorComparable);
	}
	
}
