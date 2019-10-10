package interfaces.grupal;

import java.util.ArrayList;

import composite.agrupaciones.Animal;

public class PromPesoSuperior implements CriterioGrupal {
	private double valorComparable;
	
	public PromPesoSuperior( double valorComparable) {
		this.valorComparable = valorComparable;
	}

	public boolean cumple (ArrayList<Animal>grupodeanimales) {
		double pesoaux = 0;
		for (Animal animal : grupodeanimales) {
			pesoaux += animal.getPeso();
		}
		return (pesoaux/grupodeanimales.size()>valorComparable);
	}
	
}
