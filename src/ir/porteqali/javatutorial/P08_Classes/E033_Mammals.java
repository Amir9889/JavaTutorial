package ir.porteqali.javatutorial.P08_Classes;

public class E033_Mammals extends E033_Wight {

    public E033_Mammals(int height, int weight){
        super(height,weight);
    }

    public void bodyApparatusComplexity(){
        System.out.println("We are advanced beings.");
    }

    @Override
    public void walk(){
        System.out.println("I can jumping.");
    }
}
