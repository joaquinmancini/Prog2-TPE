
public class Animal extends Conjunto{
	private int id;
	private int edad;
	double peso;
	String raza;
	String sexo;
	boolean capado;
	int parido;
	
	public Animal(int id, int edad, double peso, String raza, String sexo, boolean capado, int parido) {
		super();
		this.id = id;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.capado = capado;
		this.parido = parido;
	}


	public int getEdad() {
	return this.edad;
}
	
	public double getPeso() {
		return this.peso;
	}
	
	public int getCantidad() {
		return 1;
	}
	
	public double getPesoTotal() {
		return getPeso();
	}
}
