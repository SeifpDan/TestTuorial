/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.test;

/**
 *
 * @author dan.sarbei
 */
public class MainClas {
 
    public static void main(String[] args) {
        
        SecondClas Nt=new SecondClas();
        
        System.out.println(Nt.Height);
        
        Nt.arataFiecare(5);
        Nt.aratTot();
        
        
        
        
        System.out.println("min byte este: " + Byte.MIN_VALUE + "\nmax byte este: " + Byte.MAX_VALUE);
        System.out.println("\nmin short este: " + Short.MIN_VALUE + "\nmax short este: " + Short.MAX_VALUE);
        System.out.println("\nmin int este: " + Integer.MIN_VALUE + "\nmax int este: " + Integer.MAX_VALUE);
        System.out.println("\nmin long este: " + Long.MIN_VALUE + "\nmax long este: " + Long.MAX_VALUE);
        System.out.println("\nmin char este: " + (int)Character.MIN_VALUE + "\nmax char este: " + (int)Character.MAX_VALUE);
        System.out.println("\nmin float este: " + Float.MIN_VALUE + "\nmax float este: " + Float.MAX_VALUE);
        System.out.println("\nmin double este: " + Double.MIN_VALUE + "\nmax double este: " + Double.MAX_VALUE);
    }
}
