
public class CriterioCapado implements Criterio{
	private boolean capado;

	public CriterioCapado(boolean capado) {
		this.capado = capado;
	}
	
	public boolean cumple (Animal a) {
		return (!(a.getCapado()));
	}
}
