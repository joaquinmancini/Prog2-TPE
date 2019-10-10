package interfaces.animal;

import composite.agrupaciones.Animal;

public class CriterioPesoSuperiror implements Criterio {
	private double numero;
	private String nombre;
	
	public CriterioPesoSuperiror(double numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (a.getPeso()>numero);
	}
}
