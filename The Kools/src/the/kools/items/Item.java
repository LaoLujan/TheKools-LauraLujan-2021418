/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools.items;

/**
 *
 * @author NHLUJ
 */
/**Create my second abstract class, it is just a general characteristic such "name" */
public abstract class Item {
    protected String name;

    
    //CONSTRUCTORS
    public Item(String name) {//This constructor gives the chance to be called later on when we create a NEW object, (not done yet). We need the constructors 
        this.name = name;       //because the String name is protected, so we need to create an access door for it. 
    }
    
    public abstract void use(); // This is the method that we are going to use to "use" out items. we are going to use them on the main file and 
                            //it will be used by the subclases that depend from this file like Tool, Book etc.
}
