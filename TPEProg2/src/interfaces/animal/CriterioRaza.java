package interfaces.animal;

import composite.agrupaciones.Animal;

public class CriterioRaza implements Criterio {
	private String raza;
	private String nombre;
	
	public CriterioRaza(String raza, String nombre) {
		this.raza = raza;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (a.getRaza()==raza);
	}
}
