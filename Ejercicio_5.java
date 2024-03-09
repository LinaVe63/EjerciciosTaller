
/**
*El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
*/

import java.util.Scanner;

/**
 * @author Lina Margarita Vela Bonilla COD 20232217336
 */

public class Ejercicio_5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int capital, prestamo, equipocomputo, mobiliario, insumos;
           
            System.out.print("Ingrese saldo actual del capital: ");
            capital = scanner.nextInt();
            
            if (capital<0) {
                prestamo = 10000;
                capital +=prestamo;     
            } else { 
                if (capital<20000) {
                prestamo = 20000 - capital;
                } else {
                    prestamo = 0;
                }
            }
            
            System.out.println("Cantidad a pedir prestada al banco: U$" + prestamo);
            
            equipocomputo = 5000; 
            mobiliario = 2000;

            insumos = (capital - equipocomputo - mobiliario)/2;
            
            System.out.println("Cantidad para equipo de computo: U$" + equipocomputo);
            System.out.println("Cantidad para mobiliario: U$" + mobiliario);
            System.out.println("Cantidad para insumos: U$" + insumos);
            System.out.println("Cantidad para incentivos al personal: U$" + insumos);
        }
    }
}

