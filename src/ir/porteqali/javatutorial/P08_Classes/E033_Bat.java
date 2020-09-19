package ir.porteqali.javatutorial.P08_Classes;

public class E033_Bat extends E033_Mammals{

    public E033_Bat(int height, int weight){
        super(height,weight);
    }

    @Override
    public void walk() {
        System.out.println("I can walking!");
        super.walk();
    }

    public void fly(){
        System.out.println("I can fly.");
    }
}
