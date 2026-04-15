/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.prueba1;

/**
 *
 * @author USUARIO
 */
public class Prueba1 {
 public static void main(String[] args) {

        // Crear objetos
        Vehicles v1 = new Vehicles("V01", "Tesla", "ABC123", 100, 500);
        Drivers d1 = new Drivers("Juan", "Perez", 1, 5, 12345);
        Routes r1 = new Routes(1, 2026, 50, 10, 30);

        // Mostrar datos
        v1.showData();
        System.out.println("-------------");
        d1.showData();
        System.out.println("-------------");
        r1.showData();

        // Calcular batería
        System.out.println("Battery consumption: " + r1.calculateBattery());
    }
}