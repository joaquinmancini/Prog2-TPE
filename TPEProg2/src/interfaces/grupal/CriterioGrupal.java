package interfaces.grupal;
import java.util.ArrayList;

import composite.agrupaciones.Agrupacion;
import composite.agrupaciones.Animal;

public interface CriterioGrupal {
	public boolean cumple (Agrupacion a);
}
