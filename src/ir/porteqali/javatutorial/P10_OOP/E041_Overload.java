package ir.porteqali.javatutorial.P10_OOP;

public class E041_Overload {

    public E041_Overload(){
        hello("Ali");
        hello("Amir",18);
        hello("Ali", (float) 22.5, true);
        hello(false);
    }

    public void hello(){
        System.out.println("Heloo");
    }
    public void hello(String param1){
        System.out.println("Heloo "+param1);
    }
    public void hello(String param1, int param2){
        System.out.println("Heloo "+param1+" "+param2);
    }
    public void hello(String param1, float param2, boolean param3){
        System.out.println("Heloo "+param1+" "+param2+" "+param3);
    }
    public void hello(boolean param1){
        System.out.println("Heloo "+param1);
    }
}
