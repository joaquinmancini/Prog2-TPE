package composite.agrupaciones;

import java.util.ArrayList;

import interfaces.animal.Criterio;

public class Camion {
	Criterio c;
	int capacidad;
	ArrayList<Animal> animales;
	public Camion(int capacidad, Criterio c) {
		animales = new ArrayList<>();
		this.capacidad=capacidad;
		this.c=c;
	}
	public void setCriterio(Criterio c) {
		this.c = c;
	}
	
	public boolean sepuedecargar(Animal a) {
		
		return c.cumple(a) && (capacidad>animales.size());
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	public boolean cargar(Animal a) {
		if (capacidad>0) {
			animales.add(a);
			capacidad--;
			return true;
		}
		else return false;
	}
}
