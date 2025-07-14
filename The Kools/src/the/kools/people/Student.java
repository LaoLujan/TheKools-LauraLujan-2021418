/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools.people;

import the.kools.interfaces.Cycling;

/**
 *
 * @author NHLUJ
 */
public class Student extends Person implements Cycling {
    public Student (String name, int age){
    super (name, age);
    }
    @Override
    public void workingMoodOn(){
        System.out.println(name + " This Student is very punctual");
    }
    @Override
    public void cycle(){
        System.out.println(name + " Cycle every day to school");
    }

   
}
