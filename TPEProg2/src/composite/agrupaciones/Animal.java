package composite.agrupaciones;

import java.util.ArrayList;

import interfaces.animal.Criterio;

public class Animal extends Conjunto{
	private int id;
	private int edad;
	double peso;
	String raza;
	String sexo;
	boolean capado;
	int parido;
	
	public Animal(int id, int edad, double peso, String raza, String sexo, boolean capado, int parido) {
		this.id = id;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.capado = capado;
		this.parido = parido;
	}
	public int getId() {
	return this.id;
}

	public String getRaza() {
		return raza;
	}
	public int getEdad() {
	return this.edad;
}
	
	public double getPeso() {
		return this.peso;
	}
	
	public int getCantidad() {
		return 1;
	}
	
	public double getPesoTotal() {
		return getPeso();
	}
	public boolean getCapado() {
		return capado;
	}
	public ArrayList <Animal> getAnimalesVenta (Camion c){
		ArrayList<Animal> aux = new ArrayList<Animal>();
		if (c.sepuedecargar(this)) {
			aux.add(this);
			return aux;
		}
		else {
			return aux;
		}
	}

}
