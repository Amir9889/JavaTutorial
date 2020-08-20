package ir.porteqali.javatutorial.P07_Methods;

public class E028_MethodParameters {

    public void start(){
        System.out.println(getClass().getSimpleName());
        int x = 18;
        int y = 5;
        System.out.println(sum(x,y));
        System.out.println(sum(x,"Ameer"));
        System.out.println(sum());
        System.out.println(minus(x,y));
        System.out.println(multiple(x,y));
        System.out.println(division(x,y));
    }

    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a,String name){
        return a;
    }
    public int sum(){
        return 0;
    }

    public int minus(int a, int b){
        return a-b;
    }
    public int multiple(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
}
