package ir.porteqali.javatutorial.P07_Methods;

public class E027_MethodDataTypes {

    public void start(){
        System.out.println(getClass().getSimpleName());

        String name = "Ameer";
        int a = sum();
        System.out.println(a);
        System.out.println(hi()+name);
    }

    public void doSomething(){
        System.out.println("Go to supermarket and buy some breads.");
    }

    public int sum(){
        int a = 45;
        int b = 89;
        return a+b;
    }

    public String hi(){
        return "Hello ";
    }
}
