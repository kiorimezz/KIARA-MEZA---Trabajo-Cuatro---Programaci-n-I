// Kiara Meza
// 10- Investigue la clase Scanner en el lenguaje Java, e 
//     intégrela en un ejercicio que lo aplique.

package trabajocuatro_completo;

import java.util.Scanner;

public class determinarSiEsPar {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresá un número: ");
        
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
    }
}