package interfaces.animal;
import composite.agrupaciones.Animal;

public interface Criterio {
	public boolean cumple (Animal a);
	public String getNombre ();
}
