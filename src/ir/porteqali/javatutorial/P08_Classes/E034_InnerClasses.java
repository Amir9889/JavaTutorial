package ir.porteqali.javatutorial.P08_Classes;

public class E034_InnerClasses {

    public E034_InnerClasses(){
        System.out.println(getClass().getSimpleName());
        InnerClass.InnerClassLevel2.print("Sallam hamegi");
        NonStaticInnerClass nsic = new NonStaticInnerClass();
        nsic.print("Dorood dorood");
    }

    public static class InnerClass{

        public static class InnerClassLevel2{
            public static void print(String message){
                System.out.println(InnerClass.class.getSimpleName()+" -> "+ InnerClassLevel2.class.getSimpleName()+" -> "+message);
            }
        }
    }

    public class NonStaticInnerClass{
        public void print(String message){
            System.out.println(getClass().getSimpleName()+" -> "+message);
        }
    }
}
