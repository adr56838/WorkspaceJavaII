package devmindJava.P2.AplicatieImparteSurprize;

import java.util.Arrays;
import java.util.Random;
// final pentru a impiedica extinderea clasei
public final class GatherSurprises {

    private GatherSurprises(){}

    public static ISurprise gather(){
        Random random  = new Random();
        int randSurprise = Math.abs(random.nextInt()) % 3;
        switch(randSurprise){
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                return null;
        }
    }

    public static ISurprise[] gather(int n){
        ISurprise[] surprises = new ISurprise[n];
        for(int i = 0;i < surprises.length;i++){
            surprises[i] = GatherSurprises.gather();
        }
        return surprises;
    }

}
