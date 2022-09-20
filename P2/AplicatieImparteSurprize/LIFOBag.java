package devmindJava.P2.AplicatieImparteSurprize;
//3. O tolba care va da cadourile in ordinea inversa introducerii (strategie numita LIFO)
public class LIFOBag extends Bag {

    @Override

    public ISurprise takeout(){

        if(surprises.size() != 0){
            return surprises.remove(size()-1);
        }
        return null;
    }
}
