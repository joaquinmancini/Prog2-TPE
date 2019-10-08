import java.util.*;
public abstract class Conjunto {
	ArrayList <Animal> vacunos=new ArrayList<>();
	public int getCantidad() {
		return 0;
	}
	
	public abstract int getEdad();
	
	public abstract double getPeso();

	public abstract double getPesoTotal();
	
}
