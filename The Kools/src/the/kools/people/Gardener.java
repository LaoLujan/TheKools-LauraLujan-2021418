/*FIND THE GITHUB REPO HERE: https://github.com/LaoLujan/TheKools-LauraLujan-2021418
/*VIDE LINK HERE: https://drive.google.com/file/d/1bw2iDyPN2pJSJ4KTXwRe8laZBUhq0hWv/view?usp=sharing
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
    
    @Override 
   public void workingMoodOn(){  //this two publc voids methods means the actual performance of the action, like working, walking, driving
       System.out.println(name + " is gardening rigth now");// print it for demostation but I think is not working anyway...UPDATE. IT IS WORKING NOW!
   }
   @Override
   public void walk(){ //Now @Override put my gardener on Working mode and to Walk
       System.out.println(name + " Is walking around the garden");
   }
}
