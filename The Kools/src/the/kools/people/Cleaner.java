/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools.people;

import the.kools.interfaces.Walking;

/**
 *
 * @author NHLUJ
 */
public class Cleaner extends Person implements Walking {

 public Cleaner (String name, int age){
    super(name, age);
}
public void workingMoodOn(){
    System.out.println(name + "This cleaner is working hard");
}
public void walk(){
    System.out.println(name + "This cleaner is walking around too");}
}
