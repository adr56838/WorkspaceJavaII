package devmindJava.P2.AplicatieImparteSurprize;

import java.util.Random;

//1.O tolba care va da cadourile din interior intr-o ordine aleatoare
public class RandomBag extends Bag{

    @Override
    public ISurprise takeout(){
        if(surprises.size() != 0){
            Random random = new Random();
            int randomBag = Math.abs(random.nextInt()) % surprises.size();
            return surprises.remove(randomBag);
        }
        return null;
    }

}
