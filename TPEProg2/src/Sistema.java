import java.util.ArrayList;

public class Sistema {
	String nombre;
	ArrayList<Criterio> criterios=new ArrayList<>();
	public Sistema (String n) {
		this.nombre = n;
	}
	public void addCriterio (Criterio c) {
		criterios.add(c);
	}
	
	//preguntar
	public ArrayList <Criterio> clasificarAnimal (Animal a) {
		ArrayList<Criterio> clasificacion=new ArrayList<>();
		for (int i = 0; i<criterios.size();i++) {
			if (criterios.get(i).cumple(a))
				clasificacion.add(criterios.get(i));
		}
		return clasificacion;
	}
	public void imprimir (ArrayList<Criterio> criterios) {
		for (int i = 0; i < criterios.size(); i++) {
			System.out.println(criterios.get(i).getNombre());
		}
	}
}
