package composite.agrupaciones;
import java.util.*;

import interfaces.animal.Criterio;
public abstract class Conjunto {
	ArrayList <Animal> vacunos=new ArrayList<>();
	public int getCantidad() {
		return 0;
	}
	
	public abstract int getEdad();
	
	public abstract double getPeso();
	public boolean sePuedenVender(Criterio c) {
		return false;
	}
	public abstract double getPesoTotal();
	public abstract ArrayList <Animal> getAnimalesVenta(Camion c);
	
}
