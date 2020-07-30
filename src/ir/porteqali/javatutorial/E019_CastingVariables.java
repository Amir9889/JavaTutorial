package ir.porteqali.javatutorial;

public class E019_CastingVariables {

    public void start(){
        System.out.println(getClass().getSimpleName());

        int benz = 220;
        float bmw = 215.5f;
        String mazerati="300.36";
        String boogati="350.456";
        // String mazerati ="300";
        double ferrari = 360.65;

        bmw = Float.parseFloat(boogati);
        ferrari = Double.parseDouble(mazerati);
        StringBuilder builder=new StringBuilder();
        builder.append(ferrari).append("\n"+bmw);
        System.out.println(builder);
    }
}
