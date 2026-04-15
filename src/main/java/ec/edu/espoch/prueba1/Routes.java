/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.prueba1;

/**
 *
 * @author USUARIO
 */
public class Routes {

    public int route;
    public int date;
    public int NumberPackages;
    public int distanceTraveled;
    public int estimated;

    //contrutor
    public Routes(int route, int date, int NumberPackages, int distanceTraveled, int estimated) {
        this.route = route;
        this.date = date;
        this.NumberPackages = NumberPackages;
        this.distanceTraveled = distanceTraveled;
        this.estimated = estimated;
    }

    public void enterData(int route, int date, int NumberPackages, int distanceTraveled, int estimated) {
        this.route = route;
        this.date = date;
        this.NumberPackages = NumberPackages;
        this.distanceTraveled = distanceTraveled;
        this.estimated = estimated;

    }
    public double calculateBattery(){
        return distanceTraveled * 0.5;
    }
    public void showData(){
        System.out.println("Route:" +route);
        System.out.println("Date :" +date);
        System.out.println("Packages :"+NumberPackages);
        System.out.println("Distance :"+distanceTraveled);
        System.out.println("Estimated :"+estimated);
    }

}
