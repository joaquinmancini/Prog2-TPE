package composite.agrupaciones;
import java.util.*;

import interfaces.animal.Criterio;
import interfaces.grupal.CriterioGrupal;

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
	public void venderAnimales(Camion c){
		for (int i=0;i<conjuntos.size(); i++) {
			conjuntos.get(i).venderAnimales(c);
			
		}
		ArrayList <Animal> aCamion = c.getAnimales();
		for (int i=0; i<aCamion.size();i++) {
			conjuntos.remove(aCamion.get(i));
		}
	}
	public boolean sePuedeVender(CriterioGrupal cr) {
		return cr.cumple(this);
	}

	public ArrayList<Conjunto> getConjuntos() {
		return conjuntos;
	}
	public String imprimir () {
		String aux=this.nombre;
		for(Conjunto con:conjuntos) {
			aux+=con.imprimir()+"\n";
		}
		return aux;
	}
	
}
