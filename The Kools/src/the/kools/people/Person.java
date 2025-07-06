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


}


