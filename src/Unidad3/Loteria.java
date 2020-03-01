
package Unidad3;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Scanner loteria = new Scanner(System.in);
        int aleatorio =(int)(Math.random()*99);
        
        System.out.println("Introduce tu primer digito para jugar: ");
            int numero1 = loteria.nextInt();
         
        System.out.println("Introduce tu segundo digito para jugar: ");
            int numero2 = loteria.nextInt();      
    
            if(numero1 == ((aleatorio/10)%10) && numero2 == (aleatorio/10)){
                    System.out.println("Tu premio es de 10.000 € por acertar las dos cifras" );
                }
                
                else if((numero1 == ((aleatorio/10)%10) || numero1 == (aleatorio/10)) && (numero2 == ((aleatorio/10)%10) || numero2 == (aleatorio/10)) ){
                    System.out.println("Tu premio es de 3.000 € por acertar las dos cifras pero en diferente orden" );
                }
                
                else if(numero1 == ((aleatorio/10)%10) || numero2 == ((aleatorio/10%10)) || numero1 == (aleatorio/10) || numero2 == (aleatorio/10) ) {
                    System.out.println("Tu premio es de 1.000 € por acertar una de las dos cifras"); 
                }
                
                
                System.out.println("EL NUMERO PREMIADO A SIDO EL : " + aleatorio);
            
    }
    
}

//((numero1 == ((aleatorio/10)%10) || numero1 == (aleatorio/10)) && (numero2 != ((aleatorio/10)%10) && numero2 != (aleatorio/10)) || (numero2 == ((aleatorio/10)%10) || numero2 == ((aleatorio/10) ) && (numero1 != ((aleatorio/10)%10) && numero1 != (aleatorio/10))))