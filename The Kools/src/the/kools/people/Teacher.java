/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools.people;

import the.kools.interfaces.Driving;



/**
 *
 * @author NHLUJ
 */
public class Teacher extends Person implements Driving {
    public Teacher (String name, int age){
    super (name, age);
    }
    @Override
public void workingMoodOn() {
    System.out.println(name + "This teacher is working very hard");
}
    @Override
public void drive(){
    System.out.println(name + "He is driving 2 hours to get to school");
}
}
