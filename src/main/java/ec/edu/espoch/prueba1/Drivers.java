/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.prueba1;

/**
 *
 * @author USUARIO
 */
public class Drivers {

    public String firstname;
    public String lastname;
    public int id;
    public int years;
    public int licenseNumber;
    //construtor

    public Drivers(String firstname, String lastname, int id, int years, int licenseNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.years = years;
        this.licenseNumber = licenseNumber;
    }

    public void enterData(String firstname, String lastname, int id, int years, int licenseNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.years = years;
        this.licenseNumber = licenseNumber;
    }

    public void showData() {
        System.out.println("Driver :" + firstname + "  " + lastname);
        System.out.println("ID :"+id);
        System.out.println("Experience: "+years);
        System.out.println("License :"+licenseNumber);
      
    }
}
