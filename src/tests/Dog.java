/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author dan.sarbei
 */
public class Dog {

    String name;

    public static void main(String[] args) {
// Создаем объект Dog vl получаем к .нему доступ 
        Dog dogl = new Dog();
        dogl.bark();
        dogl.name = "Барт";

        Dog[] myDogs = new Dog[3];
//и поместим в него несколько элементов 
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dogl;
// Теперь получаем доступ :>:. объектам Dog 
// с помощью ссыпок из массива 
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        System.out.print("Имя последней собаки — ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;

        }
    }

    public void bark() {
        System.out.println(name + "сказал Гав!");
    }

    public void eat() {
    }
//public void chaseCat() { } 

}
