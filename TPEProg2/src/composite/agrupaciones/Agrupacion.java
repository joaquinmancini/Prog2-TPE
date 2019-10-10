package composite.agrupaciones;
import java.util.*;

import interfaces.animal.Criterio;

public class Agrupacion extends Conjunto{
	ArrayList <Conjunto>conjuntos=new ArrayList<>();
	String nombre;
	String tipo;
	
	
	public Agrupacion(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public int getEdad() {
		int promEdad=0;;
		for(Conjunto conj:conjuntos) {
			promEdad+=conj.getEdad();
		}
		return promEdad/getCantidad();
	}
	
	public double getPeso() {
		return getPesoTotal()/getCantidad();
	}
	
	public double getPesoTotal() {
		double peso=0;;
		for(Conjunto conj:conjuntos) {
			peso+=conj.getPesoTotal();
		}
		return peso;
	}
	
	public int getCantidad() {
		int cant=0;
		for(Conjunto conj:conjuntos) {
			cant+=conj.getCantidad();
		}
		return cant;
	}
	
	public void addConjunto(Conjunto c) {
		conjuntos.add(c);
	}
	public ArrayList<Animal> getAnimalesVenta(ArrayList<Criterio>criterios){
		ArrayList<Animal> aux = new ArrayList<Animal>();
		boolean auxcondicion =false;
		for (Animal animal : aux) {
			for (Criterio c : criterios) {
				if ((c.cumple(animal))) auxcondicion=true;
				else auxcondicion = false;
				if(auxcondicion==false) break;
			}
			if(auxcondicion==true) aux.add(animal);
		}
		return aux;
	}
}
