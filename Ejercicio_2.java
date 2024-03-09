
/**
*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
*/

import java.util.Scanner;


/**
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num, valorLlanta, valorpagar;
           
            System.out.print("Digite el número de llantas a comprar: ");
            num = scanner.nextInt();
            
            if (num<5){
                valorLlanta = 100; 
                valorpagar = 100 * num;
            } else {
                if (num<=10) {
                valorLlanta = 75; 
                valorpagar = 75 * num;
                } else {
                valorLlanta = 50; 
                valorpagar = 50 * num;  
                }    
            }
            
            System.out.println("Valor unidad llanta: U$" + valorLlanta);
            System.out.println("Total a pagar: U$" + valorpagar);
        }
    }
}

