package devmindJava.P2.AplicatieImparteSurprize;

import java.util.ArrayList;

public class Bag implements IBag {

    ArrayList<ISurprise> surprises = new ArrayList<>();

    @Override
    public void put(ISurprise newSurprises){
        this.surprises.add(newSurprises);
    }

    @Override
    public void put(IBag bagOfSuprises){
        while(!bagOfSuprises.isEmpty()){
            this.put(bagOfSuprises.takeout());
        }
    }

    @Override
    public ISurprise takeout() {
        return null;
    }

    @Override
    public boolean isEmpty(){
        return surprises.size() == 0;
    }

    @Override
    public int size(){
        return surprises.size();
    }
}
