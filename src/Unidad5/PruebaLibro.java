package Unidad5;

import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
			
//			Libro l1 = new Libro();
//			Libro l2 = new Libro();
		
			Libro2 libro2 = new Libro2();
			Libro2 libro22 = new Libro2();
        	
//			
//			l1.setAutor("Cervantes");
//			l1.setTitulo("Don quijote de la Mancha");
//			l1.setCodigo(1);
//			l1.setPrestado(false);
//			
//			l2.setAutor("Oscar Wilde");
//			l2.setTitulo("El retrato de Dorian Grey");
//			l2.setCodigo(2);
//			l2.setPrestado(true);
//			
//			System.out.println(l1.getAutor() +  " " + l1.getTitulo() +  " " + l1.getCodigo() +  " " + l1.isPrestado());
//			System.out.println(l2.getAutor() +  " " + l2.getTitulo() +  " " + l2.getCodigo() +  " " + l2.isPrestado());
		  
		
	        libro2.setTitulo("El señor de los anillos");
	        libro2.setAutor("Tolkien");
	        libro2.setNumeroEjemplares(10);
	        
	        System.out.println("Libro 2:");
	        System.out.println("Titulo: " + libro2.getTitulo());
	        System.out.println("Autor: " + libro2.getAutor());
	        System.out.println("Numero de Ejemplares: " + libro2.getNumeroEjemplares());
	        System.out.println("Prestados: " + libro2.getNumeroEjemplaresPrestados());
	        System.out.println("El libro " + libro2.getTitulo() + " esta prestado: " + libro2.prestar() + " , quedan " + libro2.getNumeroEjemplares() + " ejemplares");
	        System.out.println("El libro " + libro2.getTitulo() + " esta prestado: " + libro2.prestar() + " , quedan " + libro2.getNumeroEjemplaresPrestados() + " ejemplares");
	        System.out.println();
	        
	      	
	}

}
