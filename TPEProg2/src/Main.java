
public class Main {

	public static void main(String[] args) {
		//se crea el sistema
		Sistema sis = new Sistema("Sys");
		
		//creamos agrupaciones PD RECORDAR MEJORAR AGRUPACIONES
		Agrupacion ag1=new Agrupacion();
		Agrupacion ag2=new Agrupacion();
		Agrupacion ag3=new Agrupacion();
		
		//Creamos 4 animales
		Animal an1=new Animal(7,7,7,"a","s",true,7);
		Animal an2=new Animal(8,9,7,"a","s",false,7);
		Animal an3=new Animal(9,7,7,"a","s",true,7);
		Animal an4=new Animal(10,7,7,"a","s",true,7);
		
		//agregamos a las agrupaciones animales 
		ag3.addConjunto(an1);
		ag3.addConjunto(an2);
		ag3.addConjunto(an3);
		ag2.addConjunto(ag3);
		ag2.addConjunto(an4);
		//imprimimos peso total de todas las vacas de la agrupacion 2
		System.out.println(ag2.getPesoTotal());
		
		//añadimos criterios
		Criterio cr1= new CriterioMayorA(8, "Lechal");
		Criterio cr2 = new CriteriosAnd(new CriterioMayorA(8, "Mayor"), new CriterioMenorA(12, "menor a un año"), "Ternero");
		Criterio cr3 = new CriterioCapado(true, "Capado");
		//Añadimos los criterios mencionados anteriormente a nuestro sistema
		sis.addCriterio(cr1);
		sis.addCriterio(cr2);
		sis.addCriterio(cr3);
		//imprimimos clasificacion de 2 animales
		System.out.println("animal 2:");
		sis.imprimir(sis.clasificarAnimal(an2));
		System.out.println("Animal 4:");
		sis.imprimir(sis.clasificarAnimal(an4));
	}

}
