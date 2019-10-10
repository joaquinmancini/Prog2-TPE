import java.util.*;
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
	
	//para saber si se pueden vender los animales que posee
	public boolean sePuedenVender(Criterio c) {
		boolean aux = false;
		for(Conjunto conj:conjuntos) {
			aux = conj.sePuedenVender(c);
			if (aux== false) {
				break;
			}
		}
		return aux;
	}
}
