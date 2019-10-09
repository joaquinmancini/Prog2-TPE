
public class CriteriosOr implements Criterio {
	Criterio c1, c2;
	
	public CriteriosOr(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple (Animal a) {
		return (c1.cumple(a) || c2.cumple(a));
	}
}
