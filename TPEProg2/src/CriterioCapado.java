
public class CriterioCapado implements Criterio{
	private boolean capado;
	private String nombre;
	public CriterioCapado(boolean capado, String nombre) {
		this.capado = capado;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean cumple (Animal a) {
		return (a.getCapado());
	}
}
