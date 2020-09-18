package ir.porteqali.javatutorial.P10_OOP;

import ir.porteqali.javatutorial.P08_Classes.E033_Bat;

public class E042_This {

    public E042_This(){
        E033_Bat bat= new E033_Bat(50,30);
        bat.fly();

        /*
            Keyword of "this" is an ability to access all the properties of the current class
            Actually we create an instance of the current class by this keyword
         */
        this.print(); // ==> Correct

        /*
            We can't call a static methode or field by "this" keyword!
            Because static attributes and behaviors should call by their instance reference
         */
        //this.print("Hello"); ==> Wrong
    }

    public void print(){
        System.out.println("print");
    }

    public static void print(String name){
        System.out.println(name);
    }
}
