/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenumber;

/**
 *
 * @author dan.sarbei
 */
public class Player {

    int number = 0; // Здесь хранится вариант числа 

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Cred ca numarul " + number);
    }
}
