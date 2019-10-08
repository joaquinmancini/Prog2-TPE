import java.util.*;
public class Agrupacion extends Conjunto{
	ArrayList <Conjunto>conjuntos=new ArrayList<>();
	
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
}
