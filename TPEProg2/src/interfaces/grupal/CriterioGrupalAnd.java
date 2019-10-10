package interfaces.grupal;

public class CriterioGrupalAnd implements CriterioGrupal {
	CriterioGrupal c1, c2;

	public CriterioGrupalAnd(CriterioGrupal c1, CriterioGrupal c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple () {
		return (c1.cumple())&&(c2.cumple());
	}
}
