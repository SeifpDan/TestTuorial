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
public class SecondClas {
    
    
   public int Height = 10;
   
   
   
   
     public void arataFiecare(int x){
    int m=7+x; // locala  , de initializat inainte de prima utilizare 
    
         System.out.println(m);
    }
    
//de clasa
static void aratTot (){
    
        System.out.println("afisare tot");
        
    }
   
    public static void main(String[] args) {
        aratTot();
    }
}
