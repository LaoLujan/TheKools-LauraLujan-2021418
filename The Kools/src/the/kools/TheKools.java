/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools;

import the.kools.items.Item;
import the.kools.items.Tool;
import the.kools.people.Gardener; // Importing all what we need to start creating actual people with a specific role
import the.kools.people.Person;

/**
 *
 * @author NHLUJ
 */
public class TheKools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person gardener = new Gardener ("Laura", 33);
        Item tool = new Tool();
        
        gardener.workingMoodOn();
        ((Gardener)gardener).walk();
        
    }
    
}
