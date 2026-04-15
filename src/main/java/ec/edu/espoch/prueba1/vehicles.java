/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.prueba1;

/**
 *
 * @author USUARIO
 */
public class Vehicles {

    //atributos
    public String id;
    public String branch;
    public int batteryLevel;
    public int maximumCapacity;
    public String licensePlate;

    //construtor
    public Vehicles(String id, String branch, String licensePlate, int batteryLevel, int maximumCapacity) {
        this.id = id;
        this.branch = branch;
        this.batteryLevel = batteryLevel;
        this.maximumCapacity = maximumCapacity;
        this.licensePlate = licensePlate;
    }

    public void showData(String id, String branch, int batteryLevel, int maximumCapacity, String licensePlate) {
        this.id = id;
        this.branch = branch;
        this.batteryLevel = batteryLevel;
        this.maximumCapacity = maximumCapacity;
        this.licensePlate = licensePlate;
    }
    public void showData(){
        System.out.println("Vehicle ID:"+id);
        System.out.println("Branch :" +branch);
        System.out.println("BatteryLevel" + batteryLevel);
        System.out.println("Plate"+licensePlate);
        System.out.println("Capacity"+maximumCapacity);
    }

}
