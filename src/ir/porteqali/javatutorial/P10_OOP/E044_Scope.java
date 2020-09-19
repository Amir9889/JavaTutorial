package ir.porteqali.javatutorial.P10_OOP;

/*
        We have 2 kinds of scope:
            1: Local Scope
            2: Global Scope
        Exp(1): We can define variable in the body of class then we have Global Scope ==> Fields
        Exp(2): We can define variables in the body of methods then we have Local Scope ==> Local Variables
 */
public class E044_Scope {

    /*
        Here we define some Global Scopes:
     */
    int a =2;
    String name="Ameer";
    float b=(float) 45.68;
    boolean lala1=true;


    public E044_Scope(){
        int a =8;
        a=this.a;
        System.out.println(a);
        name="Ali";
    }

    public void localScope(){
        boolean lala=true;
    }
    public void anotherLocalScope(){
        lala1=false;
    }
}
