/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools.people;

/**
 *
 * @author NHLUJ
 */  
/** I made this class abstract, I cannot instantiated it or create an object from it, it is just a general class
that has to be used for the subclasses. It contains general characteristics that all the people have */
public abstract class Person {
    protected String name;
    protected int age;

    //CONSTRUCTORS
    public Person(String name, int age) { // The constuctor allows to access to this protected data
        this.name = name;
        this.age = age;
    }

    public void workingMoodOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  // In mt main method was telling me error so I followed the recomendations showed. This part of the code is auto generated.


}


