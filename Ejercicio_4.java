
/**
*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas en esa frutería.
*/

import java.util.Scanner;


/**
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
            double num;
            
            System.out.println("Consulte el descuento por kilo de manzana");
            System.out.println("Digite el numero de kilos a comprar: ");
            num = scanner.nextDouble();
            
            if (num<=2.0) {
            System.out.println("Aplica un descuento del 0% de su compra");
            } else {
                if (num<=5.0) {
                System.out.println("Aplica un descuento del 10% de su compra");
                } else 
                    if (num<=10) {
                    System.out.println("Aplica un descuento del 15% de su compra");
                    } else {
                     System.out.println("Aplica un descuento del 20% de su compra");
                    }
                }
            }
        }
    }

