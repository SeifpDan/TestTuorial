/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.test;

/**
 * @author dan.sarbei
 */
public class MainClas {

    public static void main(String[] args) {

        People Nt = new People();

        Student newM = new Student(75, "Ion", 2);
        newM.tell();

        Student newM2 = new Student(32, "Petru", 5);
        newM2.tell();

    }
}
