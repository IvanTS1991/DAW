package Persona;

public class Persona {
	//atributos 
	String nombre;
	 int edad;
	 float altura;
	 
	 //constructor
	 public Persona() {
		
	}
	 
	 
	 public Persona(String nombre, int edad, float altura) {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.altura = altura;
	 }
	 
	 

	//metodos
	 String consulta_Nombre(){
	 	return nombre;
	 }
	 void cambia_Nombre(String nom){
	 	nombre=nom;
	 }
}
