package ir.porteqali.javatutorial.P10_OOP;

import ir.porteqali.javatutorial.P08_Classes.E033_Bat;

/*
    ==> "super" keyword actually is to point the parent of current class
    Exp: We go to the bat class and use this keyword
 */
public class E043_Super {

    public E043_Super(){
        E033_Bat bat=new E033_Bat(50,20);
        bat.walk();
    }
}
