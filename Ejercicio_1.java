/**
*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
*/

import java.util.Scanner;


/**
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num, valorcompu = 500, valortotal, valorpagar;
            int valordescuento; 
            double descuento;
            
            System.out.print("Digite el número de computadoras a comprar: ");
            num = scanner.nextInt();
            
            if (num<5){
                descuento = 0.1; 
                System.out.println("Aplica un descuento del 10% en su compra");
            } else {
                if (num<10) {
                    descuento = 0.2;
                    System.out.println("Aplica un descuento del 20% en su compra");
                } else {
                    descuento = 0.4;
                    System.out.println("Aplica un descuento del 40% en su compra");
                }
            }
            
            valortotal = num * valorcompu;
            valordescuento = (int) (valortotal * descuento);
            valorpagar = valortotal - valordescuento;
            
            System.out.println("Valor de compra: U$" + valortotal);
            System.out.println("Valor descuento: U$" + valordescuento);
            System.out.println("Total a pagar: U$" + valorpagar);
        }
    }
}
