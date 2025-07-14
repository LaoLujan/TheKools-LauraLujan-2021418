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
public class Mop extends Item {
    public Mop(){
    super("Mop");
            }
    @Override
    public void use(){
        System.out.println("Use the Mop to clean the floor");
    }
}
