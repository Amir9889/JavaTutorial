package ir.porteqali.javatutorial.P06_Operators;

public class E023_LogicalOperators {

    public void start(){
        System.out.println(getClass().getSimpleName());

        /*
            &&
            ||
            !


            &   and
            |   or
            ^   xor
         */

        int a = 15;
        int b = 5;
        System.out.println(
                (a>b)
                ||
                !(a!=12)
                &&
                (b>=2)
        );
    }
}
