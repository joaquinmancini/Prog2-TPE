
public class Main {

	public static void main(String[] args) {
		Agrupacion ag1=new Agrupacion();
		Agrupacion ag2=new Agrupacion();
		Agrupacion ag3=new Agrupacion();
		
		Animal an1=new Animal(7,7,7,"a","s",true,7);
		Animal an2=new Animal(8,7,7,"a","s",true,7);
		Animal an3=new Animal(9,7,7,"a","s",true,7);
		Animal an4=new Animal(10,7,7,"a","s",true,7);
		
		ag3.addConjunto(an1);
		ag3.addConjunto(an2);
		ag3.addConjunto(an3);
		
		ag2.addConjunto(ag3);
		ag2.addConjunto(an4);
		System.out.println(ag2.getPesoTotal());

	}

}
