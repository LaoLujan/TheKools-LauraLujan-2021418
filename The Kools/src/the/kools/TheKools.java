/*FIND THE GITHUB REPO HERE: https://github.com/LaoLujan/TheKools-LauraLujan-2021418
/*VIDE LINK HERE: https://drive.google.com/file/d/1bw2iDyPN2pJSJ4KTXwRe8laZBUhq0hWv/view?usp=sharing
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.kools;

import the.kools.items.Book;
import the.kools.items.Item;
import the.kools.items.Mop;
import the.kools.items.Tool;
import the.kools.items.Vehicle;
import the.kools.items.miniVan;
import the.kools.people.Cleaner;
import the.kools.people.Courier;
import the.kools.people.Gardener; // Importing all what we need to start creating actual people with a specific role
import the.kools.people.Person;
import the.kools.people.Student;
import the.kools.people.Teacher;

/**
 *
 * @author NHLUJ
 */
public class TheKools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Here I am basically creating my avatars, giving them a name, age, specifying what they do and how.  
        // Every time I write the word "new" I am ivoking the classes I created
        
        //NEW PEOPLE
        Person gardener = new Gardener ("Laura", 33);// My first person is a gardener called Laura and has 33 years old
        Person cleaner = new Cleaner ("Dean", 45);
        Person teacher = new Teacher ("Sam", 77);
        Person student = new Student ("Gabriela", 21);
        Person courier = new Courier ("Ann Post", 47);
   
                
                
        //NEW ITEMS        
        Item tool = new Tool(); // I should spencified what type of tool by anyway she is working with a tool
        Item mop = new Mop(); /// I am still not usinf this items, I am only declaring they exist and they are gonna be called later
        Item vehicle = new Vehicle(); 
        Item book = new Book();
        Item minivan = new miniVan();
        
        //ON DUTY
        gardener.workingMoodOn(); //she is on duty now and she can walk
        ((Gardener)gardener).walk(); // I am specifying my character CAN walk, but is not doing it yet.
        
        cleaner.workingMoodOn();
        ((Cleaner)cleaner).walk();
        
        teacher.workingMoodOn();
        ((Teacher)teacher).drive();
        
        student.workingMoodOn();
        ((Student)student).cycle();
        
        courier.workingMoodOn();
        ((Courier)courier).drive();
    }
    
}
