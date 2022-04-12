package Predeterminadeo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;





public class Archivos {
	
	public static void crearArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {
			//crea el flujo para escribir en el archivo
			flwriter = new FileWriter("vacunas.txt");
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for(Persona persona:(ArrayList<Persona>) lista) {
				//escribe los datos en el archivo
				
				
				if(persona.getDosis2()) {
					bfwriter.write(persona.getCui() + ":[{\"vacuna\": \"covid dosis 1\", \" fecha\": \"" + persona.getFecha1() + "\"},"+
							"{\"vacuna\": \"covid dosis 2\", \" fecha\": \"" + persona.getFecha2() + "\"}]\n");
					
				}
				bfwriter.write(persona.getCui() + ":[{\"vacuna\": \"covid dosis 1\", \" fecha\": \"" + persona.getFecha1() + "\"}]\n");
			
			}
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {//cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	
	
	public static void aniadirArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("vacunas.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for(Persona persona:(ArrayList<Persona>) lista) { 
				//escribe los datos en el archivo
				
				
				if(persona.getDosis2()) {
					bfwriter.write(persona.getCui() + ":[{\"vacuna\": \"covid dosis 1\", \" fecha\": \"" + persona.getFecha1() + "\"},"+
							"{\"vacuna\": \"covid dosis 2\", \" fecha\": \"" + persona.getFecha2() + "\"}]\n");
					
				}
				bfwriter.write(persona.getCui() + ":[{\"vacuna\": \"covid dosis " + persona.getDosis1() + "\", \" fecha\": \"" + persona.getFecha1() + "\"}]\n");
			
			}
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
	
	
	
	

	  

	  

		//crea el archivo en disco, retorna la lista de estudiantes
		public static ArrayList leerArchivo() {
			// crea el flujo para leer desde el archivo
			File file = new File("vacunas.txt");
			ArrayList listaPersonas= new ArrayList<>();	
			Scanner scanner;
			try {
				Persona persona;
				//se pasa el flujo al objeto scanner
				scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					boolean vacuna1;
					boolean vacuna2;
					String fecha1;
					String fecha2;
					String linea = scanner.nextLine();
					//System.out.println(linea);
					
					String cui = linea.substring(0,13);
					
					if(linea.length()>70) {
						vacuna1 = true;
						vacuna2 = true;
						fecha1 = linea.substring(54,64);
						fecha2 = linea.substring(106,116);
							
					}else {
						vacuna1 = true;
						vacuna2= false;
						fecha1 = linea.substring(54,64);
						fecha2 = null;
					}
					
					 persona = new Persona(cui,vacuna1,vacuna2,fecha1,fecha2);
				
					listaPersonas.add(persona);

					
				}
				//se cierra el ojeto scanner
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return listaPersonas;
			
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
