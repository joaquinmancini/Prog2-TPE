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
	public abstract double getPesoTotal();
	public abstract void venderAnimales(Camion c);
	public abstract String imprimir();
	
}
