/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallons.to.liters;

/**
 *
 * @author Jordan
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons;
        double liters;
        
        gallons = 10;
        liters = gallons * 3.7854;
        
        System.out.println(gallons + " gallons is " + liters + " liters.");        
    }
    
}
