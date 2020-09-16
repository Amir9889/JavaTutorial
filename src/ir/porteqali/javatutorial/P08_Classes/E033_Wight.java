package ir.porteqali.javatutorial.P08_Classes;

public class E033_Wight {

    int Height;
    int Weight;

    public E033_Wight(int height, int weight){
        Height=height;
        Weight=weight;
    }

    public void eat(){
        System.out.println("I'm eating something.");
    }

    public void breath(){
        System.out.println("I'm breathing.");
    }

    public void growth(){
        System.out.println("I can grow.");
    }

    public void reproduction(){
        System.out.println("I can reproduce.");
    }

    public int getHeight(){
        return Height;
    }

    public int getWeight(){
        return Weight;
    }

    public void walk(){
        System.out.println("I can walking.");
    }
}
