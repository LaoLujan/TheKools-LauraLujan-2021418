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
public class Tool extends Item {  //This Tool class is a subclass of Item, thats why we extend it to it
    public Tool(){ 
    super ("Tool"); // I specified in the Item class that item shloud have a name, but is not defined there, is defined here.
                       //So I call the super class and I give it a name
        }
    
}
