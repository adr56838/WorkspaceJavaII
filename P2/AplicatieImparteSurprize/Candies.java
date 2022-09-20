package devmindJava.P2.AplicatieImparteSurprize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{


    private static final ArrayList<String> candies = new ArrayList<>(Arrays.asList("darkChocolate","fruits","vanilla","caramel","milk"));
    private final String candiesType;
    private final int nrCandies;


    public Candies(String candiesType, int nrCandies){
        this.candiesType = candiesType;
        this.nrCandies = nrCandies;
    }

    public static Candies generate(){
        Random random = new Random();
        int randomCandies = Math.abs(random.nextInt()) % candies.size();
        int nrCandies = Math.abs(random.nextInt()) % 4;
        if(nrCandies < 1){
            nrCandies = 1;
        }

        return new Candies(candies.get(randomCandies),nrCandies);
    }

    @Override
    public void enjoy(){
        System.out.println("Felicitari ai primit " + this.nrCandies + ", de felul " + candiesType);
    }
}
