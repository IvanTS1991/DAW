
package Unidad3;

import java.util.Scanner;

public class HoroscopoChino {

    public static void main(String[] args) {
        Scanner horoscopo = new Scanner(System.in);
        
        
        int año;
        int modulo;
        
        System.out.println("Introduce tu año de nacimiento : ");
            año = horoscopo.nextInt();
            
            modulo = año % 12;
           
        switch (modulo){
            case 0: 
                if (modulo == 0){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL MONO");
            }
            
            case 1:
                if (modulo == 1){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL GALLO");
            }
            
            case 2:
                if (modulo == 2){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL PERRO");
            }
            
            case 3:
                if (modulo == 3){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL CERDO");
            }
            
            case 4:
                if (modulo == 4){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES LA RATA");
            }
            
            case 5:
                if (modulo == 5){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL BUEY");
            }
            
            case 6:
                if (modulo == 6){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL TIGRE");
            }
            
            case 7:
                if (modulo == 7){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL CONEJO");
            }
            
            case 8:
                if (modulo == 8){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL DRAGON");
            }
            
            case 9:
                if (modulo == 9){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES LA SERPIENTE");
            }
            
            case 10:
                if (modulo == 10){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES EL CABALLO");
            }
            
            case 11:
                if (modulo == 11){
                  System.out.println("TU SIGNO DEL HOROSCOPO CHINO ES LA OVEJA");
            }
            
        }   
    }
    
}
