package ir.porteqali.javatutorial;

public class E020_TryCatchBlock {

    public void start(){
        System.out.println(getClass().getSimpleName());


        String a = "22sd";


        try {
            int b=Integer.parseInt(a);
            System.out.println(b);
        }catch (NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("finnaly");
        }
    }
}
