import java.util.ArrayList;

import composite.agrupaciones.Agrupacion;
import composite.agrupaciones.Animal;
import composite.agrupaciones.Camion;
import interfaces.animal.Criterio;
import interfaces.animal.CriterioCapado;
import interfaces.animal.CriterioMayorEdad;
import interfaces.animal.CriterioMenorEdad;
import interfaces.animal.CriteriosAnd;
import interfaces.grupal.*;
public class Main {

	public static void main(String[] args) {
		//se crea el sistema
		Sistema sis = new Sistema("Sys");
		
		//creamos agrupaciones PD RECORDAR MEJORAR AGRUPACIONES
		Agrupacion ag1=new Agrupacion("AG1","Rodeo");
		Agrupacion ag2=new Agrupacion("AG2", "Empresa");
		Agrupacion ag3=new Agrupacion("AG3", "Establecimiento");
		
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
		//imprimimos datos agrupacion 2
		System.out.println("Peso promedi AG2: "+ag2.getPeso());
		System.out.println("Cantidad promedio AG: "+ag2.getCantidad());
		System.out.println("Edad promedio AG: "+ag2.getEdad());
		System.out.println("Peso total AG2: "+ag2.getPesoTotal());

		//a�adimos criterios
		Criterio cr1= new CriterioMayorEdad(8, "Lechal");
		Criterio cr2 = new CriteriosAnd(new CriterioMayorEdad(8, "Mayor"), new CriterioMenorEdad(12, "menor a un anio"), "Ternero");
		Criterio cr3 = new CriterioCapado(true, "Capado");
		//criterios grupales
		CriterioGrupal cr4Ventapeso = new PromPesoSuperior(5);
		CriterioGrupal cr5VentaEdad = new PromEdadSuperior(2);

		//A�adimos los criterios mencionados anteriormente a nuestro sistema
		sis.addCriterio(cr1);
		sis.addCriterio(cr2);
		sis.addCriterio(cr3);
		//imprimimos clasificacion de 2 animales
		System.out.println("animal 2:");
		sis.imprimir(sis.clasificarAnimal(an2));
		System.out.println("Animal 4:");
		sis.imprimir(sis.clasificarAnimal(an4));
		//criterio de venta
		Camion c1 = new Camion(6,cr1);
		System.out.println(ag2.imprimir());
		ag2.venderAnimales(c1);
		//SE VENDE EL ANIMAL CON ID 8
		System.out.println("ANIMALES VENDIDOS EN CAMION");
		System.out.println(c1.getAnimales());
		//COMPROBACION QUE EL ANIMAL CON ID=8 ya no pertenece al conjunto
		System.out.println(ag2.imprimir());
	}

}
