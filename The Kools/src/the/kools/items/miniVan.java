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
public class miniVan extends Item{
    public miniVan (){
    super ("miniVan");
}
    @Override
    public void use(){
        System.out.println("Use the miniVan for work ");
    }
}
