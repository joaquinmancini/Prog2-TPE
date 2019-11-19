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
	public void venderAnimales (Camion c){
		if (c.sepuedecargar(this)) {
			c.cargar(this);
		}
	}
	public String imprimir() {
		return ""+this.getId();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
