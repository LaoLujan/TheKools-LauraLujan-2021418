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
public class Book extends Item {
    public Book(){
    super ("Book");
    }
    @Override
    public void use(){
        System.out.println("Use the book to study");
    }
}
