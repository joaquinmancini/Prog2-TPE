package interfaces.grupal;

import java.util.ArrayList;

import composite.agrupaciones.Agrupacion;
import composite.agrupaciones.Animal;

public class CriterioGrupalAnd implements CriterioGrupal {
	CriterioGrupal c1, c2;
	
	public CriterioGrupalAnd(CriterioGrupal c1, CriterioGrupal c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple (Agrupacion a) {
		return (c1.cumple(a))&&(c2.cumple(a));
	}
}
