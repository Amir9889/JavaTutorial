import ir.porteqali.javatutorial.P08_Classes.E032_Constructors;

/**
 * This class navigate us to the target classes
 */
public class Navigator {

    public static void main(String[] args){
        // showing "Navigator" to know we are using Navigator class to find our other classes
        System.out.println("Navigator");

        // Creating an instance of E032_Constructors class and call start() :
        new E032_Constructors();
        new E032_Constructors("Amir");
        new E032_Constructors("Amir", 18);


    }
}
