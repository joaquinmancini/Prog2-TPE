package interfaces.grupal;

import java.util.ArrayList;

import composite.agrupaciones.Animal;

public class PromEdadSuperior implements CriterioGrupal {
	private double valorComparable;
	
	public PromEdadSuperior(double valorComparable) {
		this.valorComparable = valorComparable;
	}
	
	public boolean cumple (ArrayList<Animal>grupodeanimales) {
		double edadaux = 0;
		for (Animal animal : grupodeanimales) {
			edadaux += animal.getEdad();
		}
		return (edadaux/grupodeanimales.size()>valorComparable);
	}
	
}
