/*FIND THE GITHUB REPO HERE: https://github.com/LaoLujan/TheKools-LauraLujan-2021418
/*VIDE LINK HERE: https://drive.google.com/file/d/1bw2iDyPN2pJSJ4KTXwRe8laZBUhq0hWv/view?usp=sharing
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
    @Override
    public void use(){
        System.out.println("Use the tool to clean the garden");
    }
}
