
package Unidad3;

import java.util.Scanner;

public class Salarios {

    public static void main(String[] args) {
        Scanner estado = new Scanner(System.in);
        
       int estadocivil = 0;
       double salario;
       double tasa10 = 0.1;
       double tasa15 = 0.15;
       double tasa25 = 0.25;
       double tasa28= 0.28;
       double tasa33 = 0.33;
       double tasa35 = 0.35;
       
       System.out.println("¿Cual es tu estado civil? : \n 0 si eres soltero;\n 1 para recien casados o viudos;\n 2 para casados o separados;\n 3 para cabezas de familia");
       
        estadocivil = estado.nextInt();
        
        System.out.println("¿Cual es tu salario: ");
        salario = estado.nextDouble();
               
        switch (estadocivil){
                        
           case 0 : 
               if(salario >= 0 && salario <= 8350) 
                   salario = salario*tasa10;
               
               if(salario >= 8351 && salario <= 33950)
                    salario = salario*tasa15;
               
               if (salario >= 33951 && salario <= 82250)
                   salario = salario*tasa25;
               
               if (salario >= 82251 && salario <= 171550)
                   salario = salario*tasa28;
               
               if (salario >= 171551 && salario <= 372950)
                   salario = salario*tasa33;
               
               if (salario >= 372951)
                   salario = salario*tasa35;
            break;   
               
           
           
           case 1 : 
               if(salario >= 0 && salario <= 16700) 
                   salario = salario*tasa10;
               
               if(salario >= 16701 && salario <= 67900)
                    salario = salario*tasa15;
               
               if (salario >= 67901 && salario <= 137050)
                   salario = salario*tasa25;
               
               if (salario >= 137051 && salario <= 208050)
                   salario = salario*tasa28;
               
               if (salario >= 208051 && salario <= 372950)
                   salario = salario*tasa33;
               
               if (salario >= 372951)
                   salario = salario*tasa35;
           break;
           
           case 2 : 
               if(salario >= 0 && salario <= 8350) 
                   salario = salario*tasa10;
               
               if(salario >= 8351 && salario <= 33950)
                    salario = salario*tasa15;
               
               if (salario >= 33951 && salario <= 68525)
                   salario = salario*tasa25;
               
               if (salario >= 68526 && salario <= 104425)
                   salario = salario*tasa28;
               
               if (salario >= 104426 && salario <= 186475)
                   salario = salario*tasa33;
               
               if (salario >= 186476)
                   salario = salario*tasa35;
           break;
           
           case 3 : 
               if(salario >= 0 && salario <= 11950) 
                   salario = salario*tasa10;
               
               if(salario >= 11951 && salario <= 45500)
                    salario = salario*tasa15;
               
               if (salario >= 45501 && salario <= 117450)
                   salario = salario*tasa25;
               
               if (salario >= 117451 && salario <= 190200)
                   salario = salario*tasa28;
               
               if (salario >= 190201 && salario <= 372950)
                   salario = salario*tasa33;
               
               if (salario >= 372951)
                   salario = salario*tasa35;
           break;
           
          }
           
          System.out.println("Tu tasa sera de impuestos anual sera de : " + salario + " €");
        
    
    }
}