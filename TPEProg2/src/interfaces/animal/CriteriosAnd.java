package interfaces.animal;
import composite.agrupaciones.Animal;

public class CriteriosAnd implements Criterio{
	Criterio c1, c2;
	String nombre;
	public CriteriosAnd(Criterio c1, Criterio c2,String nombre) {
		this.c1 = c1;
		this.c2 = c2;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (c1.cumple(a) && c2.cumple(a));
	}
}
