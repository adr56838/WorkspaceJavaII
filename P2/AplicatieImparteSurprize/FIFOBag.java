package devmindJava.P2.AplicatieImparteSurprize;

//2. O tolba care va da cadourile in ordinea in care acestea au fost introduse (strategie numita FIFO)
public class FIFOBag extends Bag{

    @Override
    public ISurprise takeout(){
    if(surprises.size() != 0){
        return surprises.remove(0);
    }
    return null;
    }


}
