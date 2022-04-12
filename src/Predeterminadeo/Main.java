package Predeterminadeo;

import java.util.ArrayList;
import java.util.HashMap;




public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
	
		HashMap<Persona,Persona> personal = new HashMap<Persona,Persona>();

		// estructura Array List para guardar los objetos estudiantes
		ArrayList listaPersonas = new ArrayList<>();
		
		Persona persona1 = new Persona("2453285791901",true,true,"19/02/2022","19/02/2022");
		Persona persona2 = new Persona("2453285791902",true,true,"19/02/2022","19/02/2022");
		Persona persona3 = new Persona("2453285791903",true,false,"19/02/2022","19/02/2022");
		Persona persona4 = new Persona("2453285791904",true,false,"19/02/2022","19/02/2022");
		Persona persona5 = new Persona("2453285791905",true,true,"19/02/2022","19/02/2022");

		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		
		Archivos.crearArchivo(listaPersonas);
		/*personal.put(persona1, persona1);
		personal.put(persona2, persona2);
		personal.put(persona3, persona3);
		personal.put(persona4, persona4);*/
		
		/*
		ArrayList nuevaLista= new ArrayList<>();
		
		Persona persona6 = new Persona("2453285791901",2,"19/02/2022");
		nuevaLista.add(persona6);
		
		//añade un estudiante más al archivo
		Operaciones.aniadirArchivo(nuevaLista);*/
		
		

		
	
		/*
		String todo =Archivos.leerTxt("vacunas.txt");
		
		String[] datos = todo.split("]");	

		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);

		}
		
		System.out.println("|||");
		System.out.println("|||");
		System.out.println("|||");
		System.out.println("|||");
		
		Archivos.leerArchivo();*/
		
		
		
		
		ArrayList listaLeida = new ArrayList<>();


		/*
		// asignar a la lista los objetos
		listaLeida = Archivos.leerArchivo();
		for(Persona persona:(ArrayList<Persona>) listaLeida) {
			
			
			personal.put(persona, persona);
			
			
		}*/
		
		
		//System.out.println(personal.keySet());
		
		
		
		
		
		
		// asignar a la lista los objetos
		listaLeida = Archivos.leerArchivo();
		for(Persona persona:(ArrayList<Persona>) listaLeida) {
			
			Persona persona7 = new Persona(persona.getCui(),persona.getDosis1(),persona.getDosis2(),persona.getFecha1(),persona.getFecha2());
			
			personal.put(persona7, persona7);
			
			System.out.println(persona.getCui()+" - "+ persona.getDosis1() + " - "+ persona.getDosis2()+" - "+persona.getFecha1()
			+ " - " + persona.getFecha2());
		}
		
		System.out.println(personal.keySet());
		
		
		Persona persona10 = new Persona("2453285791903");
		
		System.out.println(personal.containsKey(persona10));
		
		if(personal.containsKey(persona10)) {
			Persona persona12 = personal.get(persona10);
			System.out.println("//////");
			System.out.println("//////");
			System.out.println("//////");
			System.out.println(persona12.toString());
			
		}
		persona10.setDosis2(true);
		persona10.setFecha2("15/16/2021");
		personal.replace(persona10, persona10);
		
		System.out.println("cambiuo");
		if(personal.containsKey(persona10)) {
			Persona persona12 = personal.get(persona10);
			System.out.println("//////");
			System.out.println("//////");
			System.out.println("//////");
			System.out.println(persona12.toString());
			
		}
		
	}

}
