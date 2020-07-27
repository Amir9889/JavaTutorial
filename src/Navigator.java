import ir.porteqali.javatutorial.E016_Variables;
import ir.porteqali.javatutorial.E017_NamingRules;

/**
 * This class navigate us to the target classes
 */
public class Navigator {

    public static void main(String[] args){
        // showing "Navigator" to know we are using Navigator class to find our other classes
        System.out.println("Navigator");

        // Creating an instance of E017_NamingRules class and call start() :
        E017_NamingRules rules=new E017_NamingRules();
        rules.start();
    }
}
