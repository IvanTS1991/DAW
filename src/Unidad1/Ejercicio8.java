package Unidad1;

public class Ejercicio8 {

    public static void main(String[] args) {

        int numero = -54;
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero es PAR");
            } else {
                System.out.println("El numero es IMPAR");
            }
        } else {
            System.out.println("Introduce algun numero positivo");
        }
    }
}
