package interfaces.grupal;
import java.util.ArrayList;
import composite.agrupaciones.Animal;

public interface CriterioGrupal {
	public boolean cumple (ArrayList<Animal>grupodeanimales);
}
