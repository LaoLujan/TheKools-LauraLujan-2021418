/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools.people;
 
import the.kools.interfaces.Walking; // Walking interface imported, a Gardener could also Drive or use any behavior interface

/**
 *
 * @author NHLUJ
 */
public class Gardener extends Person implements Walking { //Here I am specifying I will need the superClass "Person" which have information I need
    public Gardener (String name, int age){
    super (name, age);  //This super is the constructor door I created in Person.java to access to the data
    }
    
   public void workingOnMood(){  //this two publc voids methods means the actual performance of the action, like working, walking, driving
       System.out.println(name + "is gardening rigth now");// print it for demostation but I think is not working anyway
   }
   public void walk(){
       System.out.println(name + "Is walking around the garden");
   }
}
