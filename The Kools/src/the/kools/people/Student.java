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
    public void workingMoodOn(){
        System.out.println(name + "This Student is very punctual");
    }
    public void Cycle(){
        System.out.println(name + "Cycle every day to school");}

    @Override
    public void cycle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//Again some errors about making abstract mehtods. I still cannot understand this bit
    // So the suggestions in netbeans added this Override
    
}
